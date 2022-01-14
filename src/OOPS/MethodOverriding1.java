package OOPS;

class Method1 {
	public void displayInfo() {
		System.out.println("MyToshika");
	}
}

class Method2 extends Method1 {
	@Override
	public void displayInfo() {
		System.out.println("MyToshika It Solution");
	}
}

class MethodOverriding1 {
	public static void main(String[] args) {
		Method2 method = new Method2();
		method.displayInfo();
	}
}



