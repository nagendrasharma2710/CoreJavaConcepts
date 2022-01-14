package Package1;

class Demo {
	int r = 101;
	public int s = 102;
	private int t = 103;
	protected int v = 104;
	
	void test1() {
		System.out.println(r);
	}
	void test2() {
		System.out.println(s);
	}
	void test3() {
		System.out.println(t);
	}
	void test4() {
		System.out.println(v);
	}
}
public class AccessModifier7 {
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.r);
		demo.test1();
		demo.test2();
		demo.test3();
		demo.test4();
	}
}


