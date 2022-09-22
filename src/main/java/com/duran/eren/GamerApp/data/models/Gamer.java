package com.duran.eren.GamerApp.data.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Gamer extends BaseEntity {

    private String name;

    @OneToMany
    private Set<Gamer> friends;

    @ManyToMany
    @JoinTable(
            name = "gamer_game",
            joinColumns = @JoinColumn(name = "gamer_id"),
            inverseJoinColumns = @JoinColumn(name = "game_id")
    )
    private Set<Game> games = new HashSet<>();

    @Override
    public String toString() {
        return "name :" + getName();
    }
}
