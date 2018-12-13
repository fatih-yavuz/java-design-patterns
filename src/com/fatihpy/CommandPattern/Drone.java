package com.fatihpy.CommandPattern;

public class Drone {

    private int angle = 0;

    public void rotate(int angle) {
        System.out.println("Rotating " + angle + " degree");
        this.angle += angle;
        this.angle %= 360;
        System.out.println("Current angle is: " + this.angle);
    }


}
