package com.api.graphql.service;

import graphql.ExecutionResult;
import graphql.GraphQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class GraphQLService {

    private GraphQL graphQL;

    @Autowired
    public GraphQLService(GraphQL graphQL) {
        this.graphQL = graphQL;
    }

    public Object resolve(Map<String,String> query) {
        ExecutionResult executionResult = graphQL.execute(query.get("query"));
        return executionResult.getData();
    }
}
