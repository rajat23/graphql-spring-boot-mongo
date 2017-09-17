package com.api.graphql.controller;

import com.api.graphql.service.GraphQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController()
public class GraphQLController {

    private GraphQLService graphQLService;

    @Autowired
    public GraphQLController(GraphQLService graphQLService) {
        this.graphQLService = graphQLService;
    }

    @RequestMapping(value = "/graphql",method = RequestMethod.POST)
    public Object handle(@RequestBody Map<String,String> query) {
        return graphQLService.resolve(query);
    }

}
