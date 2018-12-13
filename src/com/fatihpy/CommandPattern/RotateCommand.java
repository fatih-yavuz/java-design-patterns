package com.fatihpy.CommandPattern;

public class RotateCommand implements Command {

    private int angle;
    private Drone drone;

    public RotateCommand(Drone drone, int angle) {
        this.drone = drone;
        this.angle = angle;
    }

    @Override
    public void execute() {
        this.drone.rotate(angle);
    }

    @Override
    public void undo() {
        this.drone.rotate(-angle);
    }


}
