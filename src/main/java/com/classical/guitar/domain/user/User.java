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

	public User(){}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public List<Photo> getPrivateGallery() {
		return privateGallery;
	}

	public void setPrivateGallery(List<Photo> privateGallery) {
		this.privateGallery = privateGallery;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Score> getLibrary() {
		return library;
	}

	public void setLibrary(List<Score> library) {
		this.library = library;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	
}
