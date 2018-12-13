package com.fatihpy.FactoryMethod;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Manufacturer> manufacturers = new ArrayList<>();
        manufacturers.add(new Dell());
        manufacturers.add(new HP());
        manufacturers.add(new IBM());

        for (Manufacturer manufacturer : manufacturers) {
            for (Usage usage : Usage.values()) {
                Laptop laptop = manufacturer.createLaptop(usage);
                System.out.println(laptop);
            }
        }

    }
}
