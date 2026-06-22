package org.example;

public enum Plan {
    BASIC("Temel Plan", 100),
    STANDARD("Standart Plan", 250),
    PREMIUM("Premium Plan", 500);

    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plan{name='" + name + "', price=" + price + "}";
    }
}