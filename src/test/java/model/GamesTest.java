package model;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GamesTest {


    @Test
    public void constructorTest(){
        String expectedRating = "T";
        String expectedName = "Zelda";
        String expectedPublisher = "Nintendo";
        String expectedPlatform = "Switch";
        double expectedPrice = 80;

        Games testGames = new Games(expectedRating, expectedName, expectedPublisher, expectedPlatform, expectedPrice);

        Assertions.assertEquals(expectedRating, testGames.getRating());
        Assertions.assertEquals(expectedName, testGames.getName());
        Assertions.assertEquals(expectedPublisher, testGames.getPublisher());
        Assertions.assertEquals(expectedPlatform, testGames.getPlatform());
        Assertions.assertEquals(expectedPrice, testGames.getPrice());


    }

    @Test
    public void testSetRating(){
        String expected = "T";
        Games g = new Games();

        g .setRating(expected);
        String actual = g.getRating();
        Assertions.assertEquals(expected, actual);
    }
}
