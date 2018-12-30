package com.fatihpy.TemplateMethod;

public class Main {


    public static void main(String[] args) {
        Application tiffApp = new TIFFAplication();
        Application jpegApp = new JPEGApplication();


        tiffApp.display();
        System.out.println("-----------------");
        jpegApp.display();
    }

}
