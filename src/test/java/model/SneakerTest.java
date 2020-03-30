package model;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerTest {

    @Test
    public void constructorTest(){
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Baseball";
        int expectedSize = 10;
        int expectedQty = 60;
        double expectedPrice = 100.10;

        Sneaker testSneaker = new Sneaker (expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);


        Assertions.assertEquals(expectedId, testSneaker.getId());
        Assertions.assertEquals(expectedName, testSneaker.getName());
        Assertions.assertEquals(expectedBrand, testSneaker.getBrand());
        Assertions.assertEquals(expectedSport, testSneaker.getSport());
        Assertions.assertEquals(expectedQty, testSneaker.getQty());
        Assertions.assertEquals(expectedPrice, testSneaker.getPrice());

    }







    @Test
    public void testSetId() {
        String expected = "Devon";
        Sneaker sneaker = new Sneaker();

        sneaker.setName(expected);
        String actual = sneaker.getName();

        Assertions.assertEquals(expected, actual);
    }


}
