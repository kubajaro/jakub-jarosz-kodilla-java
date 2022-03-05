package com.kodilla.good.patterns.challenges.movies;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreService {

    public static void printMovieTitles(Map<String, List<String>> movies){
        String movieTitles = movies.entrySet().stream()
            .flatMap(entry -> entry.getValue().stream()).collect(Collectors.joining("!"));

       System.out.println(movieTitles);
    }
}
