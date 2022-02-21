package com.comparator.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Sorting with comparator. We can sort with multiple attibutes using comparator.
 */
class Student {
    int roll;
    String name;
    int age;
    Student(int roll, String name, int age){
        this.roll = roll;
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + roll +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Main{
    public static void main(String args[]){
        //create an ArrayList of Students
        List<Student> myList=new ArrayList<>();
        myList.add(new Student(2008,"Neal",25));
        myList.add(new Student(2088,"Bob",29));
        myList.add(new Student(2001,"Zerek",27));

        //to sort with age
        Collections.sort(myList,new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.age==s2.age)
                    return 0;
                else if(s1.age>s2.age)
                    return 1;
                else
                    return -1;
            }
        });

        for(Object i : myList){
            System.out.println(i);
        }

        // to sort with name
        Collections.sort(myList, new NameComparator());
        System.out.println();

        for(Object i : myList){
            System.out.println(i);
        }
    }

    public static class NameComparator  implements  Comparator<Student>{

        @Override
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }
    }

}
