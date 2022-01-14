package OOPS;

class T1 {
	 void car() {
		System.out.println("MyToshika");
	}
}
class T2 extends T1 {
	 void show() { 
		System.out.println("Noida"); 
	}
}
class T3 extends T2 {
	 void display() { 
		System.out.println("Delhi"); 
	}
}
public class Inheritance2 {
	public static void main(String[] args) {
		T3 inherit = new  T3();
		inherit.car();
		inherit.show();
		inherit.display();
	}
}




