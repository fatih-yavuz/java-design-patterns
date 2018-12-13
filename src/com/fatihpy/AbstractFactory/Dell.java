package com.fatihpy.AbstractFactory;


public class Dell extends Manufacturer {


    @Override
    public RAM createRAM(Usage usage) {
        double price = 0;
        switch (usage) {
            case Business:
                price = 299;
                break;
            case Gaming:
                price = 199;
                break;
            case Home:
                price = 99;
                break;
        }
        return new RAM(price);
    }

    @Override
    public CPU createCPU(Usage usage) {
        double price = 0;
        switch (usage) {
            case Business:
                price = 1299;
                break;
            case Gaming:
                price = 1199;
                break;
            case Home:
                price = 199;
                break;
        }
        return new CPU(price);
    }
}
