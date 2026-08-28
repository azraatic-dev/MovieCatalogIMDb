package com.azraaticipia.moviecatalogimdb;

import java.util.ArrayList;

public class Movie {

    private String title;
    private String genre;
    private float rating;
    private String description;
    private int posterResId;
    private ArrayList<Actor> actors;
    private boolean favorite;

    public Movie(String title, String genre, float rating,
                 String description, int posterResId,
                 ArrayList<Actor> actors) {

        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.description = description;
        this.posterResId = posterResId;
        this.actors = actors;
        this.favorite = false;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public float getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }

    public int getPosterResId() {
        return posterResId;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
