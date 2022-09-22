package com.duran.eren.GamerApp.data.repositories;

import com.duran.eren.GamerApp.data.models.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long> {
    Game findGameByName(String name);
}
