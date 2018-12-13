package com.fatihpy.CommandPattern;

public class Main {

    public static void main(String[] args) {

        Drone drone = new Drone();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new RotateCommand(drone, 90));
        remoteControl.setCommand(new RotateCommand(drone, 180));
        remoteControl.setCommand(new RotateCommand(drone, 270));
        remoteControl.setCommand(new RotateCommand(drone, 60));

        remoteControl.onPress(0);
        remoteControl.onPress(1);
        remoteControl.onUndo();
        remoteControl.onPress(2);
        remoteControl.onPress(3);

    }
}
