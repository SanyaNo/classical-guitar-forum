package com.classical.guitar.domain.comment;

import java.util.Date;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

import com.classical.guitar.domain.article.Article;
import com.classical.guitar.domain.user.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Comment {
	
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@NotNull
	@Column(nullable = false)
	private Date additionDate;
	
	@NotNull
	@Column(nullable = false)
	private String body;
	
	@NotNull
	@Column(nullable = false)
	private Article article;
	
	@NotNull
	@Column(nullable = false)
	private User author;
	
	private List <Comment> commentSection;
	
	@Column
	private Integer upvoting;
}
