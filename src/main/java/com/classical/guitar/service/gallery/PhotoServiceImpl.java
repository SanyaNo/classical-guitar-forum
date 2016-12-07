package com.classical.guitar.service.gallery;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classical.guitar.domain.gallery.Photo;
import com.classical.guitar.domain.gallery.PhotoDao;

@Service
public class PhotoServiceImpl implements PhotoService{
	
	@Autowired 
	private PhotoDao photoDao;

	@Override
	@Transactional
	public Long count() {
		return photoDao.count();
	}

	@Override
	@Transactional
	public void delete(Long id) {
		photoDao.delete(id);
	}

	@Override
	@Transactional
	public void delete(Photo photo) {
		photoDao.delete(photo);
	}

	@Override
	@Transactional
	public boolean exists(Long id) {
		return photoDao.exists(id);
	}

	@Override
	@Transactional
	public List<Photo> findAll() {
		return (List<Photo>) photoDao.findAll();
	}

	@Override
	@Transactional
	public Photo findPhotoById(Long id) {
		return photoDao.findOne(id);
	}

	@Override
	@Transactional
	public Photo save(Photo photo) {
		return photoDao.save(photo);
	}

}
