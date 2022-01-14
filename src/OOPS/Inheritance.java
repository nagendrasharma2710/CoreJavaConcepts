package OOPS;

class Demo {
	public void car() {
		System.out.println("MyToshika");
	}
}
class Demo1 extends Demo {
	public void show() { 
		System.out.println("Noida"); 
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Demo1 inheritance = new Demo1();
		inheritance.car();
		inheritance.show();
	}
}

