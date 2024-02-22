package com.example.unizdweb.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class FilmCreateForm {

    @Size(min = 2, max = 30, message = "Film title should have at least 2 characters")
    private String title;

    @NotEmpty(message = "Director is not allowed to be empty")
    private String director;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
