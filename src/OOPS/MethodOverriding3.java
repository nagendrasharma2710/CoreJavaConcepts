package OOPS;

class MethodOv1 {
	public void displayInfo() {
		System.out.println("MyToshika");
	}
}

class MethodOv2 extends MethodOv1 {
	public void displayInfo() {
		System.out.println("MyToshika It Solution");
	}
}

class MethodOverriding3 {
	public static void main(String [] args) {
		MethodOv2 d1 = new MethodOv2();
		d1.displayInfo();
	}
}



