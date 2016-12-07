package com.classical.guitar.service.comments;

import java.util.List;

import com.classical.guitar.domain.comment.Comment;

public interface CommentService {
	
	Long count();
	
	void delete(Long id);
	
	void delete(Comment comment);
	
	boolean exists(Long id);
	
	List<Comment> findAll();
	
	Comment findCommentById(Long id);
	
	Comment save(Comment comment);

}
