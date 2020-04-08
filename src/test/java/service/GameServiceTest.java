package service;

import model.Game;
import org.junit.jupiter.api.Assertions;

public class GameServiceTest {
    public void createTest() {
        String expectedRating = "T";
        String expectedName = "Zelda";
        String expectedPublisher = "Nintendo";
        String expectedPlatform = "Switch";
        double expectedPrice = 80;

        GameService g = new GameService();
        Game testGame = g.create(expectedRating, expectedName, expectedPublisher, expectedPlatform, expectedPrice);

        String actualRating = testGame.getRating();
        String actualName = testGame.getName();
        String actualPublisher = testGame.getPublisher();
        String actualPlatform = testGame.getPlatform();
        double actualPrice = testGame.getPrice();

        Assertions.assertEquals(expectedRating, actualRating);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedPublisher, actualPublisher);
        Assertions.assertEquals(expectedPlatform, actualPlatform);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }
}



