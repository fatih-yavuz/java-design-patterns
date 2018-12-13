package com.fatihpy.AbstractFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Manufacturer> manufacturers = new ArrayList<>();
        manufacturers.add(new Dell());
        manufacturers.add(new HP());
        manufacturers.add(new IBM());

        for (Manufacturer manufacturer : manufacturers) {
            for (Usage usage : Usage.values()) {
                LaptopPart cpu = manufacturer.createCPU(usage);
                LaptopPart ram = manufacturer.createRAM(usage);
                System.out.println(cpu);
                System.out.println(ram);
            }
        }

    }
}
