package com.ajwalker.one_to_many.uni_directional.one_side.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "tbluser")
public class User { //OWNER
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    List<Post> posts;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", posts=" + getPostsData(posts) +
                '}';
    }

    public String getPostsData(List<Post> posts) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        for (Post post : posts) {
            stringBuilder.append(post.getTitle());
            stringBuilder.append(" ");
            stringBuilder.append(post.getContent());
            stringBuilder.append("\n");

        }
        return String.valueOf(stringBuilder);
    }
}
