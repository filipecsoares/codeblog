package com.spring.codeblog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.PostRepository;
import com.spring.codeblog.service.PostService;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository repository;

	@Override
	public List<Post> findAll() {
		return repository.findAll();
	}

	@Override
	public Post findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return repository.save(post);
	}

}
