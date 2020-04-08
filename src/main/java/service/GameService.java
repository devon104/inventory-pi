package service;

import model.Game;

import java.util.ArrayList;

public class GameService {
    private String nextRating = "T";
    private ArrayList<Game> inventory = new ArrayList<>();

    public Game create(String expectedRating, String expectedName, String expectedPublisher, String expectedPlatform, double expectedPrice) {
        Game createdGame = new Game(expectedRating, expectedName, expectedPublisher, expectedPlatform, expectedPrice);

        inventory.add(createdGame);

        return createdGame;
    }
}