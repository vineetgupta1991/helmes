package com.helmes.repository;

import com.helmes.model.dao.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelmesRepository extends CrudRepository<Person, Long> {
    Person findByName(String name);
}
