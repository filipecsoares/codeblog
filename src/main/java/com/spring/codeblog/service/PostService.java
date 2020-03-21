package com.spring.codeblog.service;

import java.util.List;

import com.spring.codeblog.model.Post;

public interface PostService {

	public List<Post> findAll();

	public Post findById(Long id);

	public Post save(Post post);
}
