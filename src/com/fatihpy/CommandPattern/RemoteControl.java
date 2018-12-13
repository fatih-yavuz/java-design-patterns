package com.fatihpy.CommandPattern;

import java.util.ArrayList;

public class RemoteControl {

    private ArrayList<Command> slots = new ArrayList<Command>();
    private Command lastCommand = null;

    public void setCommand(Command command) {
        slots.add(command);
    }

    public void onPress(int slot) {
        try {
            System.out.println("Slot " + slot + " is pressed");
            Command cmd = slots.get(slot);
            lastCommand = cmd;
            cmd.execute();
        } catch (Exception exception) {
            System.out.println("There is no command in " + slot);
        }
    }

    public void onUndo() {
        System.out.println("Undo pressed");
        if (lastCommand != null) {
            lastCommand.undo();
            lastCommand = null;
        } else {
            System.out.println("Cannot undo history is empty");
        }
    }


}
