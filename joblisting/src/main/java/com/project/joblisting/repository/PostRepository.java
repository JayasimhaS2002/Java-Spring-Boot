package com.project.joblisting.repository;
//two
import org.springframework.data.mongodb.repository.MongoRepository;

//main
import com.project.joblisting.model.Post;
//main

public interface PostRepository extends MongoRepository<Post,String>// it is provided inbuilt in spring using which we can perform crud operations
{
    
}
