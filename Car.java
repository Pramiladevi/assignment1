package Assign1;

public class Car {
	public void applyBrake() {
		System.out.println("apply brake");	
	}public  void applyGear() {
		System.out.println("apply gear");	
	}public  void switchOnAc() {
		System.out.println("switch on AC");	
	}public  void applyAccelerate() {
		System.out.println("apply Accelerate");	
	}
public static void main(String[] args) {
		Car mycar=new Car();
		mycar.applyBrake();
		mycar.applyGear();
		mycar.switchOnAc();
		mycar.applyAccelerate();
		
		
	}

}
