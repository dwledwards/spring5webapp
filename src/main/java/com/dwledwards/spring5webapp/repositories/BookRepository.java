package com.dwledwards.spring5webapp.repositories;

import com.dwledwards.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
