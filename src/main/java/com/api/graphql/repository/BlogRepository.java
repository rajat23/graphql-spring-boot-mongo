package com.api.graphql.repository;

import com.api.graphql.model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BlogRepository extends MongoRepository<Blog,Integer> {
      Blog save(Blog blog);
      List<Blog> findAll();
}
