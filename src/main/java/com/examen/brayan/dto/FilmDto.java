package com.examen.brayan.dto;

public record FilmDto(
        Integer filmId,
        String title,
        String language,
        Double rentalRate
) {
}
