package com.example.unizdweb.service;

import com.example.unizdweb.dto.FilmCreateForm;
import com.example.unizdweb.dto.FilmEditForm;
import com.example.unizdweb.exception.EntityNotFoundException;
import com.example.unizdweb.model.Film;
import com.example.unizdweb.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;

    @Autowired
    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> fetchAll() {
        return filmRepository.fetchAll();
    }

    public Film fetchDetails(Integer id) {
        Optional<Film> filmOptional = filmRepository.fetchDetails(id);
        if (filmOptional.isEmpty()) {
            throw new EntityNotFoundException("Entity with id " + id + " not found!");
        }

        return filmOptional.get();
    }

    public List<Film> create(FilmCreateForm filmCreateForm) {
        List<Film> filmList = filmRepository.fetchAll();

        Film film = new Film();
        film.setId(filmList.size() + 1);
        film.setTitle(filmCreateForm.getTitle());
        film.setDirector(filmCreateForm.getDirector());

        filmRepository.create(film);

        return filmRepository.fetchAll();
    }

    public List<Film> edit(FilmEditForm filmEditForm) {
        Film film = fetchDetails(filmEditForm.getId());
        film.setTitle(filmEditForm.getTitle());
        film.setDirector(filmEditForm.getDirector());

        filmRepository.edit(film);

        return filmRepository.fetchAll();
    }

    public List<Film> delete(Integer id) {
        filmRepository.delete(id);
        return filmRepository.fetchAll();
    }
}
