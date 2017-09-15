package com.api.graphql.configuration;


import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

import static com.coxautodev.graphql.tools.SchemaParser.*;

@Configuration
public class SchemaParser {

    @PostConstruct
    public void parse() {
        newParser()
                .file("schema.graphqls")
                .build()
                .makeExecutableSchema();
    }

}
