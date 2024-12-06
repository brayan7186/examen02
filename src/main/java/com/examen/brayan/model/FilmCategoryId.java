package com.examen.brayan.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Embeddable
@NoArgsConstructor
public class FilmCategoryId implements Serializable {
    private Integer categoryId;
    private Integer filmId;

    public FilmCategoryId(Integer categoryId, Integer filmId) {
        this.categoryId = categoryId;
        this.filmId = filmId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }
}
