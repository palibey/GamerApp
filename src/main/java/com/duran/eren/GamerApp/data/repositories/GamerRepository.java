package com.duran.eren.GamerApp.data.repositories;

import com.duran.eren.GamerApp.data.models.Gamer;
import org.springframework.data.repository.CrudRepository;

public interface GamerRepository extends CrudRepository<Gamer, Long> {
    Gamer findGamerByName(String name);
}
