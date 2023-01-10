package com.example.backend.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Hand {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String startTime;
    @Transient
    private List<Player> players;
    private String communityCards;
    private String winner;
    private String blinds;
    private String blindLevel;
    private String dealer;
    private String tournamentId;

    public Hand() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getCommunityCards() {
        return communityCards;
    }

    public void setCommunityCards(String communityCards) {
        this.communityCards = communityCards;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getBlinds() {
        return blinds;
    }

    public void setBlinds(String blinds) {
        this.blinds = blinds;
    }

    public String getBlindLevel() {
        return blindLevel;
    }

    public void setBlindLevel(String blindLevel) {
        this.blindLevel = blindLevel;
    }

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(String tournamentId) {
        this.tournamentId = tournamentId;
    }
}
