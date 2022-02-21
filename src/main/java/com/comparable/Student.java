package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
     * sorting with one property using comparable. Comparable should be implemented
 * in the class where we need to compare.
     */

    class Student implements Comparable<Student> {
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


        @Override
        public int compareTo(Student st) {
            if(roll==st.roll)
                return 0;
            else if(roll>st.roll)
                return 1;
            else
                return -1;
        }
    }
    class Main{
        public static void main(String args[]){
            //create an ArrayList of Students
            List<Student> myList=new ArrayList<>();
            myList.add(new Student(2008,"Neal",25));
            myList.add(new Student(2088,"Bob",29));
            myList.add(new Student(2001,"Zerek",279));

            //to sort with age
            Collections.sort(myList);

            for(Object i : myList){
                System.out.println(i);
            }

        }
/**
 * suppose we want to sort students by their roll and names as well. When we make a collection
 * element comparable(by having it implement Comparable), we get only one chance to implement
 * the compareTo() method. The solution is using Comparator.
 */


}
