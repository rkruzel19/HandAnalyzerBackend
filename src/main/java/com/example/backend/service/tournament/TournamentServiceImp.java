package com.example.backend.service.tournament;

import com.example.backend.model.Tournament;
import com.example.backend.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentServiceImp implements TournamentService{

    @Autowired
    TournamentRepository tournamentRepository;

    @Override
    public Tournament saveTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    @Override
    public List<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }
}
