package com.example.unizdweb.repository;

import com.example.unizdweb.model.Film;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class FilmMemoryRepository implements FilmRepository {

    private List<Film> filmList = new ArrayList<>(
            List.of(
                    new Film(1, "The Shawshank Redemption", "Frank Darabont", "shawshank.jpg"),
                    new Film(2, "The Godfather", "Francis Ford Coppola", "godfather.jpg"),
                    new Film(3, "Pulp Fiction", "Quentin Tarantino", "pulpfiction.jpg"),
                    new Film(4, "The Dark Knight", "Christopher Nolan", "darkknight.jpg")
            )
    );

    public List<Film> fetchAll() {
        return filmList;
    }

    public Optional<Film> fetchDetails(Integer id) {
        return filmList.stream()
                .filter(film -> film.getId().equals(id))
                .findFirst();
    }

    public boolean create(Film film) {
        return filmList.add(film);
    }

    public void edit(Film newFilm) {
        int listIndex = fetchObjectListIndex(newFilm.getId());
        filmList.set(listIndex, newFilm);
    }

    public void delete(Integer id) {
        int listIndex = fetchObjectListIndex(id);
        filmList.remove(listIndex);
    }

    private Integer fetchObjectListIndex(Integer id) {
        int index = -1;

        for (int i = 0; i < filmList.size(); i++) {
            if (filmList.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }

        return index;
    }
}
