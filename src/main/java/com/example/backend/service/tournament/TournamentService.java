package com.example.backend.service.tournament;

import com.example.backend.model.Tournament;

import java.util.List;

public interface TournamentService {

    public Tournament saveTournament(Tournament tournament);
    public List<Tournament> getAllTournaments();

}
