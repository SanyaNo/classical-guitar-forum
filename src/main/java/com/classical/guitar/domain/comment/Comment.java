package com.classical.guitar.domain.comment;

import java.util.Date;

import java.util.List;

import javax.persistence.Entity;

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
	
	private Long id;
	
	private Date additionDate;
	
	private String body;
	
	private Article article;
	
	private User author;
	
	private List <Comment> commentSection;
	
	private Integer upvoting;
}
