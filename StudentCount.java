/* 
 * Title: Student Count using Static 
 * Author : Joswin Shaju
 * Date : 01/08/2025
 */

class Student{
	String name;
	int rollNumber;
	static int StudentCount=0;
	Student(String name,int rollNumber){
		this.name=name;
		this.rollNumber=rollNumber;
		StudentCount++;
	}
	public static void displayStudentCount() {
		System.out.println("No of Students:"+StudentCount);
	}
}


public class StudentCount {
	public static void main(String [] args) {
		Student std1=new Student("Josh",88);
		Student std2=new Student("Kenaz",69);
		Student std3=new Student("Binumon",55);
		Student.displayStudentCount();
	}
}
