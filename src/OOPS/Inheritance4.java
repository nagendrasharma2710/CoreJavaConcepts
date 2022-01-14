package OOPS;

	class Animal {
		  public void eat() {
		    System.out.println("Animals eats grass, meat");
		  }
		}

		class Dog extends Animal {
		  @Override
		  public void eat() {
		    System.out.println("Dog eats peddyGreens");
		  }

		  public void bark() {
		    System.out.println("Dog Barks...");
		  }
		}
		class Inheritance4 {
		  public static void main(String[] args) {
		    Dog labrador = new Dog();
		    labrador.eat();
		    labrador.bark();
		  }
		}


