/*
 * Name : Joswin Shaju
 * Date : 21-07-2025
 * Topic: Sum of Numbers
 */
class Calculator{
	public void add(int a , int b){
		int add=a+b;
		System.out.println("Sum of two integers:"+add);
	}
	public void add(int a,int b,int c) {
		int add=a+b+c;
		System.out.println("Sum of three integers:"+add);
	}
	public void add(double a,double b) {
		double add=a+b;
		System.out.println("Sum of two double values:"+add);
	}
	public void add(String a,int b) {
		System.out.println(a+b);
		
	}
}

public class OverloadingDemo {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.add(5, 9);
		calc.add(5.6, 8.6);
		calc.add(3, 5, 8);
		calc.add("java", 321);
	}
}
