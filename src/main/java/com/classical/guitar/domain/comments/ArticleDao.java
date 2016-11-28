package com.classical.guitar.domain.comments;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDao extends CrudRepository<Article, Long>{

}
