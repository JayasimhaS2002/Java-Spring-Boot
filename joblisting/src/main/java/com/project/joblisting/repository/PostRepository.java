package com.project.joblisting.repository;
//two
import org.springframework.data.mongodb.repository.MongoRepository;
//one
import com.project.joblisting.model.Post;
//one
public interface PostRepository extends MongoRepository<Post,String>// it is provided inbuilt in spring using which we can perform crud operations
{
    
}
