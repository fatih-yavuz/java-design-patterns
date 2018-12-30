package com.fatihpy.Composite;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class TaskComponent {
    protected ArrayList<TaskComponent> tasks = new ArrayList<>();
    protected int number;
    protected String name;
    protected int duration;
    protected TaskComponent parent = null;

    TaskComponent(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }


    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public void addTask(TaskComponent task) {
        throw new UnsupportedOperationException();
    }

    public int getChildCount() {
        return tasks.size();
    }


    public void setParent(TaskComponent parent) {
        this.parent = parent;
    }

    public boolean hasParent() {
        return this.parent != null;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNumber() {
        if (hasParent()) {
            return parent.getNumber() + "." + this.number;
        }
        return this.number + "";
    }

    public void print() {
        indent();
        String str = "";
        str += getNumber() + " \t";
        str += getName() + "\t";
        str += getDuration();
        System.out.println(str);
    }

    public void indent() {
        if (hasParent()) {
            System.out.print("\t");
            parent.indent();
        }

    }

    @Override
    public String toString() {
        return this.name + " ";

    }

    public Iterator<TaskComponent> createIterator() {
        throw new UnsupportedOperationException();
    }

}
