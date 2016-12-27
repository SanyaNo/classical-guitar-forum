package com.classical.guitar.domain.article;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDaoHibernate implements ArticleDao {
	
	@PersistenceContext
	private EntityManager em;
	
	private Criteria getBaseCriteria(){
		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Article.class, "a");
		return criteria;
	}

	@Override
	public long count() {
		return 0;
	}

	public Long getArticleCount() {
		Criteria articleCriteria = getBaseCriteria();
		Long rowCount = (Long) articleCriteria
						.setProjection(Projections.rowCount())
						.uniqueResult();
		return rowCount;
	}

	@Override
	public void delete(Long id) {
		Criteria articleCriteria = getBaseCriteria();
		Article article = (Article) articleCriteria.add(Restrictions.eq("id", id)).uniqueResult();
		em.unwrap(Session.class).delete(article);
	}

	@Override
	public void delete(Article article) {
		em.unwrap(Session.class).delete(article);
	}

	@Override
	public void delete(Iterable<? extends Article> articles) {
		for(Article article : articles){
			em.unwrap(Session.class).delete(article);
		}
	}

	@Override
	public void deleteAll() {
		System.out.println("Let's just not do this, agreed?");
	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Article> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Article> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Article> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Article> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
