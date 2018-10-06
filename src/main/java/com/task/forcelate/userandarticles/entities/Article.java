package com.task.forcelate.userandarticles.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString(exclude = {"user"})
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private int id;
    private String text;
    private Color color;
    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.ALL}

    )
    @JsonIgnore
    private User user;
}
