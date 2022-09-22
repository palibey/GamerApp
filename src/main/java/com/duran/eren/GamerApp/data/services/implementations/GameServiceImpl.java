package com.duran.eren.GamerApp.data.services.implementations;

import com.duran.eren.GamerApp.data.models.Game;
import com.duran.eren.GamerApp.data.repositories.GameRepository;
import com.duran.eren.GamerApp.data.services.interfaces.GameService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class GameServiceImpl implements GameService {
    private final GameRepository gameRepository;


    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }


    @Override
    public Set<Game> findAll() {
        Set<Game> games = new HashSet<>();
        gameRepository.findAll().forEach(games::add);
        return games;
    }

    @Override
    public Game findById(Long aLong) {
        return gameRepository.findById(aLong).orElse(new Game());
    }

    @Override
    public Game save(Game object) {
        return gameRepository.save(object);
    }

    @Override
    public void delete(Game object) {
        gameRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        gameRepository.deleteById(aLong);
    }
}
