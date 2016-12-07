package com.classical.guitar.service.comments;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classical.guitar.domain.comment.Comment;
import com.classical.guitar.domain.comment.CommentDao;

@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentDao commentDao;

	@Override
	@Transactional
	public Long count() {
		return commentDao.count();
	}

	@Override
	@Transactional
	public void delete(Long id) {
		commentDao.delete(id);
	}

	@Override
	@Transactional
	public void delete(Comment comment) {
		commentDao.delete(comment);
	}

	@Override
	@Transactional
	public boolean exists(Long id) {
		return commentDao.exists(id);
	}

	@Override
	@Transactional
	public List<Comment> findAll() {
		return (List<Comment>)commentDao.findAll();
	}

	@Override
	@Transactional
	public Comment findCommentById(Long id) {
		return commentDao.findOne(id);
	}

	@Override
	@Transactional
	public Comment save(Comment comment) {
		return commentDao.save(comment);
	}

}
