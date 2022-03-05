package com.kodilla.good.patterns.challenges.movies;

public class MovieStoreMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        MovieStoreService.printMovieTitles(movieStore.getMovies());
    }
}
