package com.examen.brayan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class FilmCategory {

    @EmbeddedId
    @Id
    private FilmCategoryId id;
    @MapsId("filmId")
    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

    private Date lastUpdate;

    public FilmCategoryId getId() {
        return id;
    }

    public void setId(FilmCategoryId id) {
        this.id = id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
