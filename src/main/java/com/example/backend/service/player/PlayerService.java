package com.example.backend.service.player;

import com.example.backend.model.Player;

import java.util.List;

public interface PlayerService {

    public Player addPlayer(Player player);
    public List<Player> getAllPlayers();

}
