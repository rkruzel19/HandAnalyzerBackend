package com.example.backend.service.hand;

import com.example.backend.model.Hand;

import java.util.List;

public interface HandService {

    public Hand saveHand(Hand hand);
    public List<Hand> getAllHands();

}
