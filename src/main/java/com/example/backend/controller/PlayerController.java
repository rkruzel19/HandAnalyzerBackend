package com.example.backend.controller;

import com.example.backend.model.Player;
import com.example.backend.service.player.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("/add")
    public String addPlayer(@RequestBody Player player){
        playerService.addPlayer(player);
        return "Player was added";
    }

    @GetMapping("/getAll")
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

}
