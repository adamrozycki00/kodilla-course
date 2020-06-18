package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Forum {

    private final List<ForumUser> forumUsers  = new ArrayList<>();

    public Forum() {
        ForumUser user1 = new ForumUser(1001, "User1", 'F',
                LocalDate.of(1990, 1, 1));
        ForumUser user2 = new ForumUser(1002, "User2", 'F',
                LocalDate.of(2000, 2, 2));
        ForumUser user3 = new ForumUser(1003, "User3", 'F',
                LocalDate.of(1990, 3, 3));
        ForumUser user4 = new ForumUser(1004, "User4", 'M',
                LocalDate.of(2000, 4, 4));
        ForumUser user5 = new ForumUser(1005, "User5", 'M',
                LocalDate.of(1990, 5, 5));
        ForumUser user6 = new ForumUser(1006, "User6", 'M',
                LocalDate.of(2000, 6, 6));
        forumUsers.add(user1);
        forumUsers.add(user2);
        forumUsers.add(user3);
        forumUsers.add(user4);
        forumUsers.add(user5);
        forumUsers.add(user6);
        Random random = new Random();
        for (ForumUser user : forumUsers)
            for (int i = 0; i < random.nextInt(4); ++i)
                user.addPost();
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsers);
    }

}
