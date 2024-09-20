package com.ajwalker.many_to_many.bi_directional.entity;

import com.ajwalker.one_to_many.uni_directional.one_side.entity.Post;
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
@Table(name = "tblgroup")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "tbl_groups_users",
            joinColumns = @JoinColumn(name = "group_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    List<User> users;

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", users=" + getData(users) +
                '}';
    }

    public String getData(List<User> users) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        for (User user : users) {
            stringBuilder.append(user.getUsername());
            stringBuilder.append("\n");

        }
        return String.valueOf(stringBuilder);
    }
}
