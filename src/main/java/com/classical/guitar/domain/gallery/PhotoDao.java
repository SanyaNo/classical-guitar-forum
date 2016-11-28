package com.classical.guitar.domain.gallery;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoDao extends CrudRepository <Photo, Long>{

}
