package utils;

import java.io.*;
import java.util.List;
import models.Movie;

public class FileManager {

    public static void saveMovies(List<Movie> list) {
        try(ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("movies.dat"))) {
            out.writeObject(list);
            System.out.println("Movies saved successfully.");
        } catch(Exception e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public static List<Movie> loadMovies() {
        try(ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("movies.dat"))) {
            return (List<Movie>) in.readObject();
        } catch(Exception e) {
            System.out.println("Error loading: " + e.getMessage());
        }
        return null;
    }
}
