package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        new Forum().getUserList().stream()
                .filter(user -> user.getSex() == ('M'))
                .filter(user -> user.getDob().isBefore(LocalDate.now().minus(20, ChronoUnit.YEARS)))
                .filter(user -> user.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user))
                .entrySet()
                .forEach(System.out::println);
    }

}
