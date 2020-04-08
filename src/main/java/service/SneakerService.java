package service;

import model.Sneaker;

import java.util.ArrayList;

public class SneakerService {
    private static int nextId = 1;
    private ArrayList<Sneaker> inventory = new ArrayList<>();

    public Sneaker create(String expectedName, String expectedBrand, String expectedSport, int expectedSize, int expectedQty, double expectedPrice) {
        Sneaker createdSneaker = new Sneaker(nextId++, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);

        inventory.add(createdSneaker);

        return createdSneaker;


    }

}
