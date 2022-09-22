package com.duran.eren.GamerApp.data.services.implementations;

import com.duran.eren.GamerApp.data.models.Gamer;
import com.duran.eren.GamerApp.data.repositories.GamerRepository;
import com.duran.eren.GamerApp.data.services.interfaces.GamerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class GamerServiceImpl implements GamerService {
    private final GamerRepository gamerRepository;

    public GamerServiceImpl(GamerRepository gamerRepository) {
        this.gamerRepository = gamerRepository;
    }


    @Override
    public Set findAll() {
        Set<Gamer> gamers = new HashSet<>();
        gamerRepository.findAll().forEach(gamers::add);
        return gamers;
    }

    @Override
    public Gamer findById(Long aLong) {
        return gamerRepository.findById(aLong).orElse(new Gamer());
    }

    @Override
    public Gamer save(Gamer object) {
        return gamerRepository.save(object);
    }

    @Override
    public void delete(Gamer object) {
        gamerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        gamerRepository.deleteById(aLong);
    }
}
