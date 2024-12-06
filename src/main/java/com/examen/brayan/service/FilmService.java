package com.examen.brayan.service;




import com.examen.brayan.dto.FilmDetailDto;
import com.examen.brayan.dto.FilmDto;

import java.util.List;

public interface FilmService {

    List<FilmDto> findAll();
    FilmDetailDto findById(Integer id);
    Boolean update(FilmDetailDto filmDetailDto);
    Boolean delete(Integer id);
    Boolean save(FilmDetailDto filmDetailDto);

}
