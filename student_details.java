package oop_lab;
import java.util.Scanner;
public class student_details {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name;
        int roll;
        float cgpa;
        System.out.print("Enter Name:\t");
        name = sc.nextLine();
        System.out.print("Enter Roll Number:\t");
        roll = sc.nextInt();
        System.out.println("Enter CGPA:");
        cgpa = sc.nextFloat();
        System.out.println("Name is: " + name);
        System.out.println("Roll Number is: " + roll);
        System.out.println("CGPA is: " +cgpa);
    }
}
