package com.classical.guitar.domain.library;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreDao extends CrudRepository <Score, Long>{

}
