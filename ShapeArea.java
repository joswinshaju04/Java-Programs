/*
 * Name : Joswin Shaju
 * Date : 21-07-2025
 * Topic: Area of shapes
 */

class AreaCalculator{
	public void area(double r) {
		double area=3.14*r*r;
		System.out.println("Area of a circle:"+area);
	}
	public void area(double l,double w) {
		double area=l*w;
		System.out.println("Area of a ractangle:"+area);
	}
	public void area(float b,double h) {
		double area=0.5*b*h;
		System.out.println("Area of a triangle:"+area);		
	}
	public void area(int a) {
		int area=a*a;
		System.out.println("Area of a square:"+area);
	}
}
public class ShapeArea {
	public static void main(String[] args) {
		AreaCalculator calc=new AreaCalculator();
		calc.area(5.3);
		calc.area(6.66,4.9);
		calc.area(9.6f,4.3);
		calc.area(8);
	}
}
