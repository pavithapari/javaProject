package models;

import java.io.Serializable;

public class Movie implements Serializable {
    private String title;
    private String genre;
    private double rating;

    // Constructor Overloading
    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.rating = 0.0;
    }

    public Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    // Method: Passing argument + returning value
    public boolean isRecommended(double minRating) {
        return this.rating >= minRating;
    }

    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public double getRating() { return rating; }

    public void setRating(double r) { this.rating = r; }
}
