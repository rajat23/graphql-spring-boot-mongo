package com.api.graphql.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class GraphQLController {

    @RequestMapping(value = "/graphql",method = RequestMethod.POST)
    public String handle(@RequestBody String query) {
        return query;
    }

}
