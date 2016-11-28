package com.classical.guitar.domain.comments;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import com.classical.guitar.domain.user.User;
@Entity
public class Comment {
	
	private Long id;
	
	private Date additionDate;
	
	private String body;
	
	private Article article;
	
	private User author;
	
	private List <Comment> commentSection;
	
	private Integer upvoting;
	
	public Comment(){}

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

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
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
