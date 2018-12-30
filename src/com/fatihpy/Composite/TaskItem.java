package com.fatihpy.Composite;

import java.util.Iterator;

public class TaskItem extends TaskComponent {


    TaskItem(String name, int duration) {
        super(name, duration);
    }

    @Override
    public Iterator<TaskComponent> createIterator() {
        return new NullIterator();
    }

}
