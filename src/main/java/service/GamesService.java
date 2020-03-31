package service;

import model.Games;

import java.util.ArrayList;

public class GamesService {
    private  String nextRating = "T";
    private ArrayList<Games> inventory = new ArrayList<>();

    public Games create(String expectedRating, String expectedName, String expectedPublisher, String expectedPlatform, double expectedPrice) {
        Games createdGame = new Games(expectedRating, expectedName, expectedPublisher, expectedPlatform, expectedPrice);

        inventory.add(createdGame);

        return createdGame;
    }
}