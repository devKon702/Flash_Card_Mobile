package com.example.flashcardmobile.model;

public class CardSet {
    private String name;
    private int quantity;
    private String ownerName;
    private int ownerAvatar;

    public CardSet() {}

    public CardSet(String name, int quantity, String ownerName, int ownerAvatar) {
        this.name = name;
        this.quantity = quantity;
        this.ownerName = ownerName;
        this.ownerAvatar = ownerAvatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getOwnerAvatar() {
        return ownerAvatar;
    }

    public void setOwnerAvatar(int ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }
}
