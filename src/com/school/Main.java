package com.school;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course();
        c1.setDetails(1 , "quantum");
        Course c2 = new Course();
        c2.setDetails(2 , "dsma");


        Student student = new Student();
        student.setDetails(11 , "krish");
        Student student2 = new Student(); 
        student2.setDetails(12 , "keshav");
        
        Student[] arr2 = {student , student2};
        System.out.println("Registered Students: ");
        for(Student n : arr2) n.displayDetails();
        Course [] arr1 = {c1 , c2};
        System.out.println("Registered course: ");
        for(Course c : arr1) c.displayDetails();
        


    }
}