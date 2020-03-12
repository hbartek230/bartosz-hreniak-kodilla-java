package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumComment {
    public String commentBody;
    public String author;
    ForumPost forumPost;

    public ForumComment(String commentBody, String author, ForumPost forumPost) {
        this.commentBody = commentBody;
        this.author = author;
        this.forumPost = forumPost;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public String getAuthor() {
        return author;
    }

    public ForumPost getForumPost() {
        return forumPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumComment that = (ForumComment) o;
        return commentBody.equals(that.commentBody) &&
                author.equals(that.author) &&
                forumPost.equals(that.forumPost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentBody, author, forumPost);
    }
}
