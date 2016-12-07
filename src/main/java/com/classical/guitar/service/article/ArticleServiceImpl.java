package com.classical.guitar.service.article;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classical.guitar.domain.article.Article;
import com.classical.guitar.domain.article.ArticleDao;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;

	@Override
	public Long count() {
		return articleDao.count();
	}

	@Override
	@Transactional
	public void delete(Long id) {
		articleDao.delete(id);
	}

	@Override
	@Transactional
	public void delete(Article article) {
		articleDao.delete(article);
	}

	@Override
	@Transactional
	public boolean exists(Long id) {
		return articleDao.exists(id);
	}

	@Override
	@Transactional
	public List<Article> findAll() {
		return (List<Article>)articleDao.findAll();
	}

	@Override
	@Transactional
	public Article findArticleById(Long id) {
		return articleDao.findOne(id);
	}

	@Override
	@Transactional
	public Article save(Article article) {
		return articleDao.save(article);
	}

}
