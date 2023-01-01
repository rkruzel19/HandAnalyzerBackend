package com.example.backend.controller;

import com.example.backend.model.Hand;
import com.example.backend.service.hand.HandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hand")
public class HandController {

    @Autowired
    private HandService handService;

    @PostMapping("/add")
    public String addHand(@RequestBody Hand hand){
        handService.saveHand(hand);
        return "Hand was added";
    }

    @GetMapping("/getAll")
    public List<Hand> getAllHands(){
        return handService.getAllHands();
    }

}
