package com.api.graphql.repository;

import com.api.graphql.model.Blog;

import java.util.ArrayList;
import java.util.List;

public class BlogRepository {
    private final List<Blog> blogs;

    public BlogRepository() {
        blogs = new ArrayList<>();
        blogs.add(new Blog("REST in peace.GraphQL live long", "GraphQL dominating now days"));
        blogs.add(new Blog("Kotlin for Android", "how useful is kotlin for android dev"));
    }

    public void saveBlog(Blog blog) {
        blogs.add(blog);
    }

    public List<Blog> getAllBlogs() {
        return blogs;
    }
}
