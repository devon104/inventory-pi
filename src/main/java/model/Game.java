package model;

public class Game {
    private String rating;
    private String name;
    private String publisher;
    private String platform;
    private double price;

    public Game() {
    }
    public Game(String rating, String name, String publisher, String platform, double price) {
        this.rating = rating;
        this.name = name;
        this.publisher = publisher;
        this.platform = platform;
        this.price = price;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
