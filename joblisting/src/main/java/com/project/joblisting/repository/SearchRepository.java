package com.project.joblisting.repository;
//one
import java.util.List;
//one
import com.project.joblisting.model.Post;
//one
public interface SearchRepository {

    List<Post> findBytext(String text);

}