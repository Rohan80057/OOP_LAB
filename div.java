package oop_lab;
import java.util.Scanner;
public class div {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Num1:\t");
		int a=sc.nextInt();
		System.out.print("Enter Num2:");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("Division is:" +c);
	}
}
