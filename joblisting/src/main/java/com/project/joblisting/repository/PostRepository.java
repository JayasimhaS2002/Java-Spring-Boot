package com.project.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.joblisting.model.Post;

public interface PostRepository extends MongoRepository<Post,String>// it is provided inbuilt in spring using which we can perform crud operations
{
    
}
