package com.ajwalker.forum.entity;
//CURRENT_DATE
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Post {
    private Integer id;
    private Integer user_id;
    private String title;
    private String content;
    private LocalDate post_date;

    public Post() {
    }

    public Post(Integer userID, String title, String content) {
        this.user_id = userID;
        this.title = title;
        this.content = content;
        this.post_date =  LocalDate.now();
    }

    public Post(Integer id, Integer userID, String title, String content) {
        this.id = id;
        this.user_id = userID;
        this.title = title;
        this.content = content;
        this.post_date = LocalDate.now();
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserID() {
        return user_id;
    }

    public void setUserID(Integer userID) {
        this.user_id = userID;
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
        return post_date;
    }

    public void setPostDate(LocalDate postDate) {
        this.post_date = postDate;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", userID=" + user_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", postDate=" + post_date +
                '}';
    }
}

