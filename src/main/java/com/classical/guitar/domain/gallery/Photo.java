package com.classical.guitar.domain.gallery;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import com.classical.guitar.domain.comment.Comment;
import com.classical.guitar.domain.user.User;
@Entity
public class Photo {
	
	private Long id;
	
	private Date additionDate;
	
	private String path;
	
	private User author;
	
	private List <Comment> commentSection;
	
	private Integer upvoting;
	
	public Photo(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getAdditionDate() {
		return additionDate;
	}

	public void setAdditionDate(Date additionDate) {
		this.additionDate = additionDate;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public List<Comment> getCommentSection() {
		return commentSection;
	}

	public void setCommentSection(List<Comment> commentSection) {
		this.commentSection = commentSection;
	}

	public Integer getUpvoting() {
		return upvoting;
	}

	public void setUpvoting(Integer upvoting) {
		this.upvoting = upvoting;
	}

	
}
