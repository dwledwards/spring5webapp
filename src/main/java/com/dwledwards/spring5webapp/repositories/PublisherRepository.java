package com.dwledwards.spring5webapp.repositories;

import com.dwledwards.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
