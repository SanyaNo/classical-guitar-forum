package com.classical.guitar.domain.library;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.classical.guitar.domain.user.User;
@Entity
@Table(name = "score")
public class GuitarProScore implements Score {
	
	private Long id;
	
	private String path;
	
	private User user;
	
	private Date additionDate;
	
	private String title;
	
	private String author;
	
	private final String FILE_TYPE = "*.gp";
	
	public GuitarProScore(){} 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getAdditionDate() {
		return additionDate;
	}

	public void setAdditionDate(Date additionDate) {
		this.additionDate = additionDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getFILE_TYPE() {
		return FILE_TYPE;
	}
	
}
