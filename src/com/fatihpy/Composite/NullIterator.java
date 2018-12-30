package com.fatihpy.Composite;

import java.util.Iterator;

public class NullIterator implements Iterator<TaskComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public TaskComponent next() {
        return null;
    }
}
