/* 
 * Title: Program to input student detail
 * Author : Joswin Shaju
 * Date : 11/08/2025
 */


package jv;

import java.util.Scanner;

class Student{
    String name;
    int rollNumber;
    char grade;

    public void StudentDetail(){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter  the name of the student:");
		name=sc.nextLine();
		System.out.println("Enter the roll number:");
		rollNumber=sc.nextInt();
		System.out.println("Enter the grade:");
		grade=sc.next().charAt(0);
    }
    public void printDetail(){
        System.out.println("Name:"+name);
		System.out.println("Roll No:"+rollNumber);
		System.out.println("Grade:"+grade);
    }
}

public class Std_detail {
	public static void main(String[] args) {
        Student students= new Student();
        students.StudentDetail();
        students.printDetail();
     
	}
}
