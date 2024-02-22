package com.example.unizdweb.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class FilmEditForm {

    @NotNull
    private Integer id;

    @Size(min = 2, max = 30, message = "Film title should have at least 2 characters")
    private String title;

    @NotEmpty(message = "Director is not allowed to be empty")
    private String director;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
