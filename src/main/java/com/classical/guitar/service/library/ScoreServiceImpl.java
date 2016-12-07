package com.classical.guitar.service.library;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classical.guitar.domain.library.Score;
import com.classical.guitar.domain.library.ScoreDao;

@Service
public class ScoreServiceImpl implements ScoreService {
	
	@Autowired
	private ScoreDao scoreDao;

	@Override
	@Transactional
	public Long count() {
		return scoreDao.count();
	}

	@Override
	@Transactional
	public void delete(Long id) {
		scoreDao.delete(id);
	}

	@Override
	@Transactional
	public void delete(Score score) {
		scoreDao.delete(score);
	}

	@Override
	@Transactional
	public boolean exists(Long id) {
		return scoreDao.exists(id);
	}

	@Override
	@Transactional
	public List<Score> findAll() {
		return (List<Score>) scoreDao.findAll();
	}

	@Override
	@Transactional
	public Score findScoreById(Long id) {
		return scoreDao.findOne(id);
	}

	@Override
	@Transactional
	public Score save(Score score) {
		return scoreDao.save(score);
	}

}
