package StaticAndFinal;

public class StaticKeyword2 {
	public static void main(String []args) {
		System.out.println(A.number);
		A.display();
	}
}
class A {
	static int number = 10;
	public static void display() {
		System.out.println("A");
	}
}