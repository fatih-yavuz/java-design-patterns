package com.fatihpy.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {


    public static void main(String[] args) {

        CTIS290 ctis290 = new CTIS290();
        CTIS310 ctis310 = new CTIS310();

        ctis310.addStudent(new Student(1,"Fatih Yavuz", "Insider"));
        ctis310.addStudent(new Student(2,"Ali İmran Özbatman", "Ekinoks"));
        ctis290.addStudent(new Student(3,"Tunahan Bayındir", "Neozeka"));
        ctis290.addStudent(new Student(4,"Berat Postalcı", "Ekinoks"));
        ctis290.addStudent(new Student(5,"Muratcan Balık", "Cybersoft"));

        Iterator<Student> i1 = ctis290.getItarator();
        Iterator<Student> i2 = ctis310.getItarator();


        ArrayList<Student> students = new ArrayList<>();

        addToList(i1,students);
        addToList(i2, students);

        for(Student student: students) {
            System.out.println(student);
        }

    }

    public static void addToList(Iterator<Student> iterator, ArrayList<Student> list) {
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
    }

}
