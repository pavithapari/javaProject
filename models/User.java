package models;

import java.util.*;

public class User {
    protected String name;

    // Aggregation: User has movies
    protected List<Movie> watchlist;

    public User(String name) {
        this.name = name;
        this.watchlist = new ArrayList<>(); // Composition
    }

    public void addToWatchlist(Movie m) {
        watchlist.add(m);
        System.out.println(m.getTitle() + " added to watchlist!");
    }

    public List<Movie> getWatchlist() {
        return watchlist;
    }
}
