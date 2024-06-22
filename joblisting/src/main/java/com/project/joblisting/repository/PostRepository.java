package com.project.joblisting.repository;
//two
import org.springframework.data.mongodb.repository.MongoRepository;
//two
import com.project.joblisting.model.Post;
//two
public interface PostRepository extends MongoRepository<Post,String>// it is provided inbuilt in spring using which we can perform crud operations
{
    
}
