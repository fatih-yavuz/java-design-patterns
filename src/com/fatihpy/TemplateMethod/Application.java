package com.fatihpy.TemplateMethod;

public abstract class Application {

    final public void openFile() {
        System.out.println("Opening file.");
    }

    final public void loadToMemory() {
        System.out.println("Loading the image to the memory.");
    }

    public abstract void process();

    public abstract void enchance();

    public boolean isEnhancable() {
        return false;
    }

    final public void display() {
        openFile();
        loadToMemory();
        process();
        if(this.isEnhancable()) {
            enchance();
        }
        System.out.println("Displaying the image.");
    }

}
