package com.fatihpy.AbstractFactory;


public class HP extends Manufacturer {


    @Override
    public RAM createRAM(Usage usage) {
        double price = 0;
        switch (usage) {
            case Business:
                price = 399;
                break;
            case Gaming:
                price = 299;
                break;
            case Home:
                price = 199;
                break;
        }
        return new RAM(price);
    }

    @Override
    public CPU createCPU(Usage usage) {
        double price = 0;
        switch (usage) {
            case Business:
                price = 1399;
                break;
            case Gaming:
                price = 1299;
                break;
            case Home:
                price = 299;
                break;
        }
        return new CPU(price);
    }
}
