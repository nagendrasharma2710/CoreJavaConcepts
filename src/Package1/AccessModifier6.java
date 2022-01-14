package Package1;

class AccessModifier6 {
	public static void main(String []args) {
		m1();
		m2();
		Access ac = new Access();
		ac.m3();
	}
	static void m1() {
		System.out.println("hi");
	}
	static void m2() {
		System.out.println("hey");
	}
}
class Access {
	void m3() {
		System.out.println("hello");
	}
}
