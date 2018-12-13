package com.fatihpy.FactoryMethod;

public class Laptop {

    private double price;

    Laptop(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return price + "";
    }
}
