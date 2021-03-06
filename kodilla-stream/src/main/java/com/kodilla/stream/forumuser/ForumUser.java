package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userId;
    private final String username;
    private final char sex;
    private final LocalDate dob;
    private final int numberOfPosts;

    public ForumUser(int userId, String username, char sex, LocalDate dob, int numberOfPosts) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.dob = dob;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dob=" + dob +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }

}
