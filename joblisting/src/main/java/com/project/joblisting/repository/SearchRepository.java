package com.project.joblisting.repository;
//main
import java.util.List;
//main
import com.project.joblisting.model.Post;
//main
public interface SearchRepository {

    List<Post> findBytext(String text);

}