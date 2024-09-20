package com.ajwalker.many_to_many.bi_directional.entity;

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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "users", cascade = CascadeType.PERSIST)
    List<Group> groups;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", groups=" + getData(groups) +
                '}';
    }

    public String getData(List<Group> groups) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        for (Group group : groups) {
            stringBuilder.append(group.getName());
            stringBuilder.append("\n");

        }
        return String.valueOf(stringBuilder);
    }
}
