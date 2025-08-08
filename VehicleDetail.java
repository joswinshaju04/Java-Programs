/* 
 * Title: Inheritance demo 
 * Author : Joswin Shaju
 * Date : 08/08/2025
 */


package prgs;

class Vehicle{
	String brand;
	String model;
	
	Vehicle(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	public void DisplayDetail() {
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
	}
}
class Car extends Vehicle{
	String fuelType;
	
	Car(String brand,String model,String fuelType){
		super(brand,model);
		this.fuelType=fuelType;
	}
	public void DisplayDetail() {
		super.DisplayDetail();
		System.out.println("Fuel Type:"+fuelType);
	}
}
class ElectricCar extends Car{
	double batteryCapacity;
	ElectricCar(String brand,String model,String fuelType,double batteryCapacity){
		super(brand ,model,fuelType);
		this.batteryCapacity=batteryCapacity;
	}
	public void DisplayDetail() {
		super.DisplayDetail();
		System.out.println("Battery Capacity"+batteryCapacity);
	}
}
public class VehicleDetail {
	public static void main(String [] args) {
		
		ElectricCar electric=new ElectricCar("MG","Windsor","Electric",550);
		electric.DisplayDetail();
	}
}
