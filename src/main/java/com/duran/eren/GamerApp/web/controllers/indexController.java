package com.duran.eren.GamerApp.web.controllers;

import com.duran.eren.GamerApp.data.models.Gamer;
import com.duran.eren.GamerApp.data.services.interfaces.GamerService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
public class indexController {
    private final GamerService gamerService;

    public indexController(GamerService gamerService) {
        this.gamerService = gamerService;
        Gamer gamer = new Gamer();
        Gamer gamer1 = new Gamer();
        gamer1.setId(1L);
        gamer1.setName("Friend");
        Set<Gamer> set = new HashSet<>();
        set.add(gamer1);
        gamer.setId(2L);
        gamer.setName("Gamer");
        gamer.setFriends(set);
        gamerService.save(gamer1);
        gamerService.save(gamer);

    }

    @GetMapping("/gamer/{id}")
    public Gamer index(@PathVariable("id") Long id){
        System.out.println(gamerService.findById(id));
        return gamerService.findById(id);
    }


    @PostMapping("gamer/add")
    public void addGamer(@RequestBody Gamer gamer){
        gamerService.save(gamer);
    }

}
