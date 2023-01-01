package com.example.backend.service.hand;

import com.example.backend.model.Hand;
import com.example.backend.repository.HandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HandServiceImp implements HandService{

    @Autowired
    HandRepository handRepository;

    @Override
    public Hand saveHand(Hand hand) {
        return handRepository.save(hand);
    }

    @Override
    public List<Hand> getAllHands() {
        return handRepository.findAll();
    }
}
