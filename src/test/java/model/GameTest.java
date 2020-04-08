package model;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GameTest {


    @Test
    public void constructorTest() {
        String expectedRating = "T";
        String expectedName = "Zelda";
        String expectedPublisher = "Nintendo";
        String expectedPlatform = "Switch";
        double expectedPrice = 80.99;

        Game testGame = new Game(expectedRating, expectedName, expectedPublisher, expectedPlatform, expectedPrice);

        Assertions.assertEquals(expectedRating, testGame.getRating());
        Assertions.assertEquals(expectedName, testGame.getName());
        Assertions.assertEquals(expectedPublisher, testGame.getPublisher());
        Assertions.assertEquals(expectedPlatform, testGame.getPlatform());
        Assertions.assertEquals(expectedPrice, testGame.getPrice());


    }

    @Test
    public void testSetRating() {
        String expected = "T";
        Game g = new Game();

        g.setRating(expected);
        String actual = g.getRating();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSetName() {
        String expected = "Zelda";
        Game g = new Game();

        g.setName(expected);
        String actual = g.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSetPublisher() {
        String expected = "Nintendo";
        Game g = new Game();

        g.setPublisher(expected);
        String actual = g.getPublisher();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSetPlatform() {
        String expected = "Switch";
        Game g = new Game();

        g.setPlatform(expected);
        String actual = g.getPlatform();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSetPrice() {
        double expected = 80.99;
        Game g = new Game();

        g.setPrice(expected);
        double actual = g.getPrice();

        Assertions.assertEquals(expected, actual);
    }
}
