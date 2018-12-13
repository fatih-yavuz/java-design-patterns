package com.fatihpy.AbstractFactory;

public abstract class Manufacturer {
    public abstract RAM createRAM(Usage usage);
    public abstract CPU createCPU(Usage usage);
}
