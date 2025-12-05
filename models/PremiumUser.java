package models;

public class PremiumUser extends User {

    public PremiumUser(String name) {
        super(name);
    }

    @Override
    public void addToWatchlist(Movie m) {
        System.out.println("Premium user gets priority recommendation added!");
        super.addToWatchlist(m);
    }
}
