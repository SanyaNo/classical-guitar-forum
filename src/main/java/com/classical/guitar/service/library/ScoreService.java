package com.classical.guitar.service.library;

import java.util.List;

import com.classical.guitar.domain.library.Score;

public interface ScoreService {
	
	Long count();
	
	void delete(Long id);
	
	void delete(Score score);
	
	boolean exists(Long id);
	
	List<Score> findAll();
	
	Score findScoreById(Long id);
	
	Score save(Score score);

}
