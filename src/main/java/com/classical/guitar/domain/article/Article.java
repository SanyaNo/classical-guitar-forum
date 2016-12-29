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

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
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
}
