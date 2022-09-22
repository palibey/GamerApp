package com.duran.eren.GamerApp.data.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String name;

    @ManyToMany(mappedBy = "games")
    private Set<Gamer> gamers = new HashSet<>();



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
