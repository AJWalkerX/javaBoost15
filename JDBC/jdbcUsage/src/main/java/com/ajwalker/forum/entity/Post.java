package com.ajwalker.forum.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Post {
    private Integer id;
    private Integer userID;
    private String title;
    private String content;
    private LocalDate postDate;

    public Post() {
    }

    public Post(Integer userID, String title, String content) {
        this.userID = userID;
        this.title = title;
        this.content = content;
        this.postDate =  LocalDate.now();
    }

    public Post(Integer id, Integer userID, String title, String content) {
        this.id = id;
        this.userID = userID;
        this.title = title;
        this.content = content;
        this.postDate = LocalDate.now();
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", userID=" + userID +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", postDate=" + postDate +
                '}';
    }
}

