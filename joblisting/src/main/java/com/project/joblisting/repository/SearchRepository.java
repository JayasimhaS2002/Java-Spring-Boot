package com.project.joblisting.repository;
//tw0
import java.util.List;
//two
import com.project.joblisting.model.Post;
//twos
public interface SearchRepository {

    List<Post> findBytext(String text);

}