package com.fatihpy.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class CTIS290 implements Iterable {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public Iterator<Student> getItarator() {
        return students.iterator();
    }
}
