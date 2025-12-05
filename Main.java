import models.*;
import utils.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Event System
        EventManager em = new EventManager();
        em.addListener(event -> System.out.println("EVENT: " + event));

        em.trigger("Application Started");

        // Create Movies
        Movie m1 = new Movie("Interstellar", "Sci-Fi", 9.0);
        Movie m2 = new Movie("Dune", "Sci-Fi", 8.7);
        Movie m3 = new Movie("Toy Story", "Animation", 8.1);

        Movie[] arr = {m1, m2, m3};

        // User
        PremiumUser user = new PremiumUser("Alice");
        user.addToWatchlist(m1);
        user.addToWatchlist(m3);

        // Recommendations
        SimpleRecommender rec = new SimpleRecommender();
        Movie best = rec.recommend(arr);

        System.out.println("Top movie recommended: " + best.getTitle());

        // Collections - filter
        RecommendationEngine engine = new RecommendationEngine();
        List<Movie> list = Arrays.asList(arr);
        List<Movie> sci = engine.filterByGenre(list, "Sci-Fi");

        System.out.println("Sci-Fi Movies:");
        for(Movie m : sci) System.out.println(m.getTitle());

        // Save to file
        FileManager.saveMovies(list);

        em.trigger("Movies saved to file");
    }
}
