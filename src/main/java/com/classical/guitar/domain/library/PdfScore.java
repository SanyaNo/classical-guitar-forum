package com.classical.guitar.domain.library;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.classical.guitar.domain.user.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "score")
public class PdfScore implements Score {
	
	private String path;
	
	private User user;
	
	private Date additionDate;
	
	private String title;
	
	private String author;
	
	private final String FILE_TYPE = "*.pdf";
}
