package com.api.graphql.configuration;


import com.api.graphql.query.Query;
import com.api.graphql.repository.BlogRepository;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.coxautodev.graphql.tools.SchemaParser.newParser;

@Configuration
public class GraphQLConfiguration {

    @Bean
    public BlogRepository blogRepository(){
        return new BlogRepository();
    }

    @Bean
    public GraphQL graphQL() {
        return GraphQL.newGraphQL(graphQLSchema())
                .build();
    }

    @Bean
    public GraphQLSchema graphQLSchema() {
        return newParser()
                .file("schema.graphqls")
                .resolvers(new Query(blogRepository()))
                .build()
                .makeExecutableSchema();
    }

}
