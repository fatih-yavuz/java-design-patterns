package com.fatihpy.AbstractFactory;

public class CPU extends LaptopPart {
    CPU(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "CPU " + super.toString();
    }

}
