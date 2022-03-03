package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;

public class MovieStoreService {

    public static void printMovieTitles(Map<String, List<String>> movies){
        movies.entrySet().stream().flatMap(list -> list.getValue().stream())
                .forEach(movie -> System.out.print(movie + "!"));
    }
}
