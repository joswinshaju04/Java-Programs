/* 
 * Title: Static demo example
 * Author : Joswin Shaju
 * Date : 29/07/2025
 */

package jv;

class Student{
	String name;
	static int StudentCount=0;
	Student( String name){
		this.name=name;
		StudentCount++;
	}
	public void printDetails() {
		System.out.println(name);
		System.out.println(StudentCount);
	}
}

public class StaticDemo {
	public static void main(String [] args) {
		Student student=new Student("test1");
		student.printDetails();
		Student student1=new Student("test2");
		student1.printDetails();
		
	}
}
