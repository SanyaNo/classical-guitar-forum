package com.classical.guitar.service.gallery;

import java.util.List;

import com.classical.guitar.domain.gallery.Photo;

public interface PhotoService {
	Long count();
	
	void delete(Long id);
	
	void delete(Photo photo);
	
	boolean exists(Long id);
	
	List<Photo> findAll();
	
	Photo findPhotoById(Long id);
	
	Photo save(Photo photo);
}
