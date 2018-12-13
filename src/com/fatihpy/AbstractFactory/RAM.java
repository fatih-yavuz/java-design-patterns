package com.fatihpy.AbstractFactory;

public class RAM extends LaptopPart {

    RAM(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "RAM " + super.toString();
    }
}
