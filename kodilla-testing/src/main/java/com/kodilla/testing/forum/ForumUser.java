package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {

    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String name, String realName) {
        //name visible on forum
        this.name = name;
        //real name of the user
        this.realName = realName;
    }

    public void addPost(String author, String postBody) {
        posts.add(new ForumPost(postBody, author));
    }

    public void addComment(ForumPost thePost, String author, String commentBody) {
        comments.add(new ForumComment(thePost, commentBody, author));
    }

    public int getPostsQuantity() {
        return posts.size();
    }

    public int getCommentsQuantity() {
        return comments.size();
    }

    public ForumPost getPost(int postNumber) {
        ForumPost thePost = null;
        if (postNumber >= 0 && postNumber < posts.size()) {
            thePost = posts.get(postNumber);
        }
        return thePost;
    }

    public ForumComment getComment(int commentNumber) {
        ForumComment theComment = null;
        if (commentNumber >= 0 && commentNumber < comments.size()){
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }

    public boolean removePost(ForumPost thePost) {
        // return true temporarily
        return true;
    }

    public boolean removeComment(ForumComment theComment) {
        // return true temporarily
        return true;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

}
