package service;

import model.Games;
import org.junit.jupiter.api.Assertions;

public class GamesServiceTest{
    public void createTest(){
        String expectedRating = "T";
        String expectedName = "Zelda";
        String expectedPublisher = "Nintendo";
        String expectedPlatform = "Switch";
        double expectedPrice = 80;

        GamesService g = new GamesService();
        Games testGame = g.create(expectedRating, expectedName, expectedPublisher, expectedPlatform, expectedPrice );

        String actualRating = testGame.getRating();
        String actualName = testGame.getName();
        String actualPublisher = testGame.getPublisher();
        String actualPlatform = testGame.getPlatform();
        double actualPrice = testGame.getPrice();

        Assertions.assertEquals(expectedRating, actualRating);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedPublisher, actualPublisher);
        Assertions.assertEquals(expectedPlatform, expectedPlatform);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }














}



