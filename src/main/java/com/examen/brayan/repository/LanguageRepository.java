package com.examen.brayan.repository;


import com.examen.brayan.model.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends CrudRepository<Language,Integer> {
}
