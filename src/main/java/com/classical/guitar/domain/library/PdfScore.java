package com.classical.guitar.domain.library;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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
	
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@NotNull
	@Column(nullable = false)
	private String path;
	
	@NotNull
	@Column(nullable = false)
	private User user;
	
	@NotNull
	@Column(nullable = false)
	private Date additionDate;
	
	@NotNull
	@Column(nullable = false)
	private String title;
	
	@NotNull
	@Column(nullable = false)
	private String author;
	
	private final String FILE_TYPE = "*.pdf";
}
