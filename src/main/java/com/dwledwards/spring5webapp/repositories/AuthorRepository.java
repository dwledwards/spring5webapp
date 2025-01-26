package com.dwledwards.spring5webapp.repositories;

import com.dwledwards.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created on 23/01/2025
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
