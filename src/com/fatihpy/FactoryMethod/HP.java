package com.fatihpy.FactoryMethod;

public class HP extends Manufacturer {

    @Override
    public Laptop createLaptop(Usage usage) {
        double price = 0;
        switch (usage) {
            case Business:
                price = 1299.99;
                break;
            case Gaming:
                price = 1199.99;
                break;
            case Home:
                price = 599.99;
                break;
        }

        return new Laptop(price);
    }
}
