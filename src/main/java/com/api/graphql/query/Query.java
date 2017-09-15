package com.api.graphql.query;

import com.api.graphql.model.Blog;
import com.api.graphql.repository.BlogRepository;
import com.coxautodev.graphql.tools.GraphQLRootResolver;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Query implements GraphQLRootResolver {

    private final BlogRepository blogRepository;

    @Autowired
    public Query(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public List<Blog> allBlogs() {
        return blogRepository.getAllBlogs();
    }
}
