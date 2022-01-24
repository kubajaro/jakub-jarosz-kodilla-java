package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> resultMap = forum.getList().stream()
                .filter(f -> f.getSex() == 'M')
                .filter(f -> ChronoUnit.YEARS.between(f.getBirthDate(), LocalDate.now()) > 17)
                .filter(f -> f.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, f -> f));

        System.out.println("# of elements in map: " + resultMap.size());
            resultMap.entrySet().stream()
                    .map(entry -> entry.getKey() + ": " + entry.getValue())
                    .forEach(System.out::println);
    }
}
