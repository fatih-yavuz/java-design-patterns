package com.fatihpy.AbstractFactory;


public class IBM extends Manufacturer {


    @Override
    public RAM createRAM(Usage usage) {
        double price = 0;
        switch (usage) {
            case Business:
                price = 499;
                break;
            case Gaming:
                price = 399;
                break;
            case Home:
                price = 299;
                break;
        }
        return new RAM(price);
    }

    @Override
    public CPU createCPU(Usage usage) {
        double price = 0;
        switch (usage) {
            case Business:
                price = 1499;
                break;
            case Gaming:
                price = 1399;
                break;
            case Home:
                price = 399;
                break;
        }
        return new CPU(price);
    }
}
