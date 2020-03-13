package com.kodilla.testing.forum.statistics;

public class ForumStatistic {
    private double avgPostsPerUser, avgCommentsPerUser, avgCommentsPerPost;
    private int postCount, commentsCount, usersCount;

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public void calculateAdvStatistics(Statistics statistics){
        postCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        usersCount = statistics.usersNames().size();
        if(usersCount > 0) {
            avgPostsPerUser = (double)postCount / usersCount;
        } else {
            avgPostsPerUser = 0;
        }
        if(usersCount > 0) {
            avgCommentsPerUser = (double)commentsCount / usersCount;
        } else {
            avgCommentsPerUser = 0;
        }
        if(postCount > 0) {
            avgCommentsPerPost = (double)commentsCount / postCount;
        } else {
            avgCommentsPerPost = 0;
        }
    }

    public void showStatistics(){
        System.out.println("Forum statistics");
        System.out.println("Post count: " + postCount);
        System.out.println("Comments count: " + postCount);
        System.out.println("Users count: " + postCount);
        System.out.println("Averrage posts per user: " + avgPostsPerUser);
        System.out.println("Averrage comments per user: " + avgCommentsPerUser);
        System.out.println("Averrage comments per post: " + avgCommentsPerPost);
    }
}
