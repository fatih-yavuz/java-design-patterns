package com.fatihpy.Iterator;

import java.util.Arrays;
import java.util.Iterator;

public class CTIS310 implements Iterable {

    private Student[] students = new Student[10];

    private static int index = 0;


    public void addStudent(Student student) {
        students[index++] = student;
    }

    @Override
    public Iterator<Student> getItarator() {

        return Arrays.asList(Arrays.copyOfRange(students, 0, index - 1)).iterator();
    }
}
