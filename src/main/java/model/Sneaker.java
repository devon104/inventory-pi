package model;

public class Sneaker {
    private int id;
    private String name;
    private String brand;
    private String sport;
    private int size;
    private int qty;
    private double price;

    public Sneaker() {
    }

    public Sneaker(int id, String name, String brand, String sport, int size, int qty, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.sport = sport;
        this.size = size;
        this.qty = qty;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;

    }

    public void setBrand(String brand) {
        this.brand = brand;

    }

    public String getBrand() {
        return brand;

    }

    public void setId(int id) {
        this.id = id;

    }

    public int getId() {
        return id;

    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }


    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}