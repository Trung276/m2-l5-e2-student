package student;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Student: " + student.getName());
        System.out.println("Class: " + student.getClassOfStudent());
        System.out.println("Enter the name: ");
        String name = sc.next();
        student.setName(name);
        System.out.println("Enter the class: ");
        String classes = sc.next();
        student.setClassOfStudent(classes);
        System.out.println("Student: " + student.getName());
        System.out.println("Class: " + student.getClassOfStudent());
    }
}
