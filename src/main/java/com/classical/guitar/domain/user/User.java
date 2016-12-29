package com.classical.guitar.domain.user;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

import com.classical.guitar.domain.comment.Comment;
import com.classical.guitar.domain.gallery.Photo;
import com.classical.guitar.domain.library.Score;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {
	
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@NotNull
	@Column(unique = true, nullable = false)
	private String username;
	
	@NotNull
	@Column(nullable = false)
	private String firstName;
	
	@NotNull
	@Column(nullable = false)
	private String lastName;
	
	@NotNull
	@Column(nullable = false)
	private String password;
	
	@NotNull
	@Column(nullable = false)
	private int age;
	
	@NotNull
	@Column(nullable = false, unique = true)
	private String email;
	
	@NotNull
	@Column
	private String gender;
	
	@NotNull
	@Column(nullable = false)
	private Date registrationDate;
	
	private List<Photo> privateGallery;
	
	private List<Score> library;
	
	private List<Comment> comments;

}
