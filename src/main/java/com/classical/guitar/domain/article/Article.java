package com.classical.guitar.domain.article;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

import com.classical.guitar.domain.comment.Comment;
import com.classical.guitar.domain.user.User;
@Entity
public class Article {
	
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@NotNull
	@Column(unique = true, nullable = false)
	private Date additionDate;
	
	@NotNull
	@Column(nullable = false)
	private User author;
	
	private List <Comment> commentSection;
	
	@NotNull
	@Column
	private Integer upvoting;
	
	@NotNull
	@Column(unique = true, nullable = false)
	private String title;
	
	@NotNull
	@Column(nullable = false)
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
