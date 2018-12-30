package com.fatihpy.TemplateMethod;

public class JPEGApplication extends Application {
    @Override
    public void process() {
        System.out.println("Processing JPEG.");
    }

    @Override
    public void enchance() {
        System.out.println("JPEG cannot be enhanced.");
    }

}
