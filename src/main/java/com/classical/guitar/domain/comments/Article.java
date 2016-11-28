package com.classical.guitar.domain.comments;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import com.classical.guitar.domain.user.User;
@Entity
public class Article {
	
	private Long id;
	
	private Date additionDate;
	
	private User author;
	
	private List <Comment> commentSection;
	
	private Integer upvoting;
	
	private String title;
	
	private String body;
	
	public Article(){}

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
}
