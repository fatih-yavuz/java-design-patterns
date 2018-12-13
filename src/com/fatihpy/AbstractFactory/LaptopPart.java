package com.fatihpy.AbstractFactory;

public abstract class LaptopPart {

    private final double price;

    LaptopPart(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Price: " + this.getPrice();
    }
}
