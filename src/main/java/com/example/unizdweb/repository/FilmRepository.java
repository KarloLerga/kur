package com.example.unizdweb.repository;

import com.example.unizdweb.model.Film;

import java.util.List;
import java.util.Optional;

public interface FilmRepository {
    List<Film> fetchAll();

    Optional<Film> fetchDetails(Integer id);

    boolean create(Film film);

    void edit(Film film);

    void delete(Integer id);

}
