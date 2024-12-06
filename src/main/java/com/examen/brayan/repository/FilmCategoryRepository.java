package com.examen.brayan.repository;


import com.examen.brayan.model.FilmCategory;
import com.examen.brayan.model.FilmCategoryId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmCategoryRepository extends CrudRepository<FilmCategory, FilmCategoryId> {
}
