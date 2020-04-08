package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SneakerTest {

    @Test
    public void constructorTest() {
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Baseball";
        int expectedSize = 10;
        int expectedQty = 60;
        double expectedPrice = 100.10;

        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);


        Assertions.assertEquals(expectedId, testSneaker.getId());
        Assertions.assertEquals(expectedName, testSneaker.getName());
        Assertions.assertEquals(expectedBrand, testSneaker.getBrand());
        Assertions.assertEquals(expectedSport, testSneaker.getSport());
        Assertions.assertEquals(expectedQty, testSneaker.getQty());
        Assertions.assertEquals(expectedPrice, testSneaker.getPrice());

    }


    @Test
    public void testSetName() {
        String expected = "Stan Smith";
        Sneaker sneaker = new Sneaker();

        sneaker.setName(expected);
        String actual = sneaker.getName();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void testSetBrand() {
        String expected = "Adidas";
        Sneaker sneaker = new Sneaker();

        sneaker.setBrand(expected);
        String actual = sneaker.getBrand();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testSetSport() {
        String expected = "Baseball";
        Sneaker sneaker = new Sneaker();

        sneaker.setSport(expected);
        String actual = sneaker.getSport();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSetSize() {
        int expected = 10;
        Sneaker sneaker = new Sneaker();

        sneaker.setSize(expected);
        int actual = sneaker.getSize();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testSetQty() {
        int expected = 60;
        Sneaker sneaker = new Sneaker();

        sneaker.setQty(expected);
        int actual = sneaker.getQty();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSetPrice() {
        double expected = 100.10;
        Sneaker sneaker = new Sneaker();

        sneaker.setPrice(expected);
        double actual = sneaker.getPrice();

        Assertions.assertEquals(expected, actual);
    }
}
