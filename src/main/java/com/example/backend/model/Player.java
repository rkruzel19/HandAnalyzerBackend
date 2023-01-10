package com.example.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Player {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int stackSize;
    private String wholeCards;
    private String seatPosition;
    private String handPosition;
    private String handId;
    private String displayName;

    public Player() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStackSize() {
        return stackSize;
    }

    public void setStackSize(int stackSize) {
        this.stackSize = stackSize;
    }

    public String getWholeCards() {
        return wholeCards;
    }

    public void setWholeCards(String wholeCards) {
        this.wholeCards = wholeCards;
    }

    public String getSeatPosition() {
        return seatPosition;
    }

    public void setSeatPosition(String seatPosition) {
        this.seatPosition = seatPosition;
    }

    public String getHandPosition() {
        return handPosition;
    }

    public void setHandPosition(String handPosition) {
        this.handPosition = handPosition;
    }

    public String getHandId() {
        return handId;
    }

    public void setHandId(String handId) {
        this.handId = handId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
