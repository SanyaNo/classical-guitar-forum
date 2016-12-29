package com.classical.guitar.domain.comment;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.classical.guitar.domain.user.User;

@Repository
public interface CommentDao extends CrudRepository <Comment, Long>{
	@Query("") //TODO
	Collection<Comment> findByAuthor(User author);
}
 