package com.fatihpy.Composite;

import java.util.Iterator;

public class Task extends TaskComponent {


    Task(String name) {
        super(name, 0);
        this.setNumber(1);
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public void addTask(TaskComponent task) {
        task.setParent(this);
        task.setNumber(getChildCount() + 1);
        this.tasks.add(task);
    }

    @Override
    public int getDuration() {
        int duration = this.duration;
        Iterator<TaskComponent> iterator = this.createIterator();

        while (iterator.hasNext()) {
            TaskComponent task = iterator.next();
            duration += task.getDuration();
        }
        return duration;
    }


    @Override
    public Iterator<TaskComponent> createIterator() {
        return this.tasks.iterator();
    }

    public void print() {
        super.print();

        if (getChildCount() > 0) {
            System.out.println();
        }

        Iterator<TaskComponent> iterator = createIterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }

        if (getChildCount() > 0) {
            System.out.println();
        }
    }
}
