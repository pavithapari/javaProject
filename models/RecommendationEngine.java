package models;

import java.util.*;

public class RecommendationEngine {

    // Passing array of objects and returning object
    public Movie getBestMovie(Movie[] movies) {
        Movie best = movies[0];
        for(Movie m : movies) {
            if(m.getRating() > best.getRating()) {
                best = m;
            }
        }
        return best;
    }

    // Using Collections
    public List<Movie> filterByGenre(List<Movie> list, String genre) {
        List<Movie> result = new ArrayList<>();
        for(Movie m : list) {
            if(m.getGenre().equalsIgnoreCase(genre)) result.add(m);
        }
        return result;
    }
}
