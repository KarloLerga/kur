package com.example.unizdweb.service;

import com.example.unizdweb.dto.FilmCreateForm;
import com.example.unizdweb.dto.FilmEditForm;
import com.example.unizdweb.model.Film;

import java.util.List;

public interface FilmService {

    List<Film> fetchAll();

    Film fetchDetails(Integer id);

    List<Film> create(FilmCreateForm filmCreateForm);

    List<Film> edit(FilmEditForm filmEditForm);

    List<Film> delete(Integer id);
}
