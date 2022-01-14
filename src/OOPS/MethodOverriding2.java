package OOPS;

class MethodOver1 {
	public void displayInfo() {
		System.out.println("Delhi");
	}
}

class MethodOver2 extends MethodOver1 {
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Noida");
	}
}

class MethodOverriding2 {
	public static void main(String[] args) {
		MethodOver2 methodover = new MethodOver2();
		methodover.displayInfo();
	}
}


