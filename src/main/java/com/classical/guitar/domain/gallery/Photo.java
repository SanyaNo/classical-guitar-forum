package com.classical.guitar.domain.gallery;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import com.classical.guitar.domain.comment.Comment;
import com.classical.guitar.domain.user.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Photo {
	
	private Long id;
	
	private Date additionDate;
	
	private String path;
	
	private User author;
	
	private List <Comment> commentSection;
	
	private Integer upvoting;
}
