package com.gabrielmol.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielmol.workshopmongo.domain.Post;
import com.gabrielmol.workshopmongo.repository.PostRepository;
import com.gabrielmol.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;

	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Object not found"));
	}
}