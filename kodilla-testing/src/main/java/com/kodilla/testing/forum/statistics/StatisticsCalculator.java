package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avgNumberOfPostsPerUser;
    private double avgNumberOfCommentsPerUser;
    private double avgNumberOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        avgNumberOfPostsPerUser = (double) numberOfPosts / numberOfUsers;
        avgNumberOfCommentsPerUser = (double) numberOfComments / numberOfUsers;
        avgNumberOfCommentsPerPost = (double) numberOfComments / numberOfPosts;
    }

    public void showStatistics() {
        System.out.printf("Number of users: %d\n", numberOfUsers);
        System.out.printf("Number of posts: %d\n", numberOfPosts);
        System.out.printf("Number of comments: %d\n", numberOfComments);
        System.out.printf("Average number of posts per user: %.2f\n", avgNumberOfPostsPerUser);
        System.out.printf("Average number of comments per user: %.2f\n", avgNumberOfCommentsPerUser);
        System.out.printf("Average number of comments per post: %.2f\n", avgNumberOfCommentsPerPost);
    }

}
