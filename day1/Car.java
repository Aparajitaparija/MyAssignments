package week1.day1;

public class Car {
	
	public void driveCar() {
		System.out.println("I know how to drive.");
	}
	public void applyBrake() {
		System.out.println("Brake!");
	}
	public void soundHorn() {
		System.out.println("Press the horn.");
	}
	public void isPuncture() {
		System.out.println("Your tire is punctured.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car bmw = new Car();
		bmw.driveCar();
		bmw.applyBrake();
		bmw.soundHorn();
		bmw.isPuncture();
			
	}

}
