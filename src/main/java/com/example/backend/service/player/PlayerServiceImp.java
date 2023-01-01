package com.example.backend.service.player;

import com.example.backend.model.Player;
import com.example.backend.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImp implements PlayerService{

    @Autowired
    PlayerRepository playerRepository;

    @Override
    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }
}
