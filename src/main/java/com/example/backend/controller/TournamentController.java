package com.example.backend.controller;

import com.example.backend.model.Tournament;
import com.example.backend.service.tournament.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tournament")
public class TournamentController {

    @Autowired
    TournamentService tournamentService;

    @PostMapping("/add")
    public String add(@RequestBody Tournament tournament) {
        tournamentService.saveTournament(tournament);
        return "Tournament has been added";
    }

    @GetMapping("/getAll")
    public List<Tournament> getAllTournaments(){
        return tournamentService.getAllTournaments();
    }


}
