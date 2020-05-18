package com.kodilla.patterns.strategy.social;

public class User {
    protected SocialPublisher publisher;
    private final String username;

    public User(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public String sharePost(){
        return publisher.share();
    }

    public void setPublisher(SocialPublisher publisher){
        this.publisher = publisher;
    }

}
