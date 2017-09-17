package com.api.graphql.resolver;

import com.api.graphql.model.Blog;
import com.api.graphql.repository.BlogRepository;
import com.coxautodev.graphql.tools.GraphQLRootResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLRootResolver {

    private BlogRepository blogRepository;

    @Autowired
    public Mutation(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public Blog createBlog(String title, String content) {
        Blog blog = new Blog(title,content);
        blogRepository.saveBlog(blog);
        return blog;
    }
}
