package models;

public class SimpleRecommender extends RecommenderBase {

    @Override
    public Movie recommend(Movie[] list) {
        Movie best = list[0];
        for(Movie m : list) {
            if(m.getRating() > best.getRating())
                best = m;
        }
        return best;
    }
}
