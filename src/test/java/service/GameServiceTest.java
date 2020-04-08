package service;

import model.Game;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameServiceTest {

    @Test
    public void createTest() {
        String expectedRating = "T";
        String expectedName = "Zelda";
        String expectedPublisher = "Nintendo";
        String expectedPlatform = "Switch";
        double expectedPrice = 80;

        GameService gs = new GameService();
        Game testGame = gs.create(expectedRating, expectedName,
                expectedPublisher, expectedPlatform, expectedPrice);

        int actualId = testGame.getId();
        String actualRating = testGame.getRating();
        String actualName = testGame.getName();
        String actualPublisher = testGame.getPublisher();
        String actualPlatform = testGame.getPlatform();
        double actualPrice = testGame.getPrice();

        Assertions.assertEquals(1, actualId);
        Assertions.assertEquals(expectedRating, actualRating);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedPublisher, actualPublisher);
        Assertions.assertEquals(expectedPlatform, actualPlatform);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }
}



