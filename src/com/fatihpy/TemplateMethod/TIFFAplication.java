package com.fatihpy.TemplateMethod;

public class TIFFAplication extends Application {

    public boolean isEnhancable = true;

    @Override
    public void process() {
        System.out.println("Processing TIFF image");
    }

    @Override
    public void enchance() {
        System.out.println("Enhancing TIFF.");
    }

    @Override
    public boolean isEnhancable() {
        return true;
    }
}
