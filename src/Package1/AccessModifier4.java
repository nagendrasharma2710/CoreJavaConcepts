package Package1;

class Calculator {
	public void calculator(int s, int t) {
		System.out.println("sum : "+ (s+t));
	}
}
class ScCalculate {
	public void calculator(int s, int t) {
		System.out.println("product : "+ (s*t));
	}
}
class HyCalculate {
	public void calculator(int s, int t) {
		System.out.println("sum : "+(s+t));
		System.out.println("product : "+ (s*t));
	}
}
public class AccessModifier4 {
	public static void main(String []args) {
		System.out.println("Main Class");
		Calculator cal = new Calculator();
		cal.calculator(4, 6);
		ScCalculate cal2 = new ScCalculate();
		cal2.calculator(4, 6);
		HyCalculate cal3 = new HyCalculate();
		cal3.calculator(4, 6);
	}
}

