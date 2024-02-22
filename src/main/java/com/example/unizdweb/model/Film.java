package com.example.unizdweb.model;

public class Film {

    private Integer id;

    private String title;

    private String director;
    private String iconLocation;

    public Film() {
    }

    public Film(Integer id, String title, String director, String iconLocation) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.iconLocation = iconLocation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getIconLocation() {
        return iconLocation;
    }

    public void setIconLocation(String iconLocation) {
        this.iconLocation = iconLocation;
    }

}
