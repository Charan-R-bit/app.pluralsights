package com.pluralsight.blog.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.blog.model.Post;
import org.springframework.data.rest.core.annotation.RestResource;

public interface PostRepository extends JpaRepository<Post, Long> 
{
	public List<Post> findByTitleContaining(String title);
	}