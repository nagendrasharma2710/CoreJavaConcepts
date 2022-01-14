package OOPS;

class Vehicle {
	  public void engine() {
	    System.out.println("Have one engine");
	  }
	}
	class Car extends Vehicle {
	  @Override
	  public void engine() {
	    super.engine();
	    System.out.println("Have one steering");
	  }
	  public void lights() {
	    System.out.println("car have 4 headLights");
	  }
	}
	class Inheritance3 {
	  public static void main(String[] args) {
	    Car car = new Car();
	    car.engine();
	    car.lights();
	  }
	}


