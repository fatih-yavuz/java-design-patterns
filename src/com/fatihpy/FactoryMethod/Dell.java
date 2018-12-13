package com.fatihpy.FactoryMethod;

public class Dell extends Manufacturer {


    @Override
    public Laptop createLaptop(Usage usage) {
        double price = 0;
        switch (usage) {
            case Business:
                price = 1199.99;
                break;
            case Gaming:
                price = 999.99;
                break;
            case Home:
                price = 499.99;
                break;
        }

        return new Laptop(price);
    }


}
