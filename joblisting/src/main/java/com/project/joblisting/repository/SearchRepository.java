package com.project.joblisting.repository;

import java.util.List;

import com.project.joblisting.model.Post;

public interface SearchRepository {

    List<Post> findBytext(String text);

}