package com.classical.guitar.service.article;

import java.util.List;

import com.classical.guitar.domain.article.Article;

public interface ArticleService {
	
	Long count();
	
	void delete(Long id);
	
	void delete(Article article);
	
	boolean exists(Long id);
	
	List<Article> findAll();
	
	Article findArticleById(Long id);
	
	Article save(Article article);

}
