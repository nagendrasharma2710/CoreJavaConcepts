
public class DataTypeAndVariable1 {
	int a = 5;
	static int b = 6;
	public static void main(String []args) {
		DataTypeAndVariable1 data = new DataTypeAndVariable1();
		data.m1();
		data.m2();
	}
	void m1() {
		int c = 8;
		int d = (a+b+c);
		System.out.println(d);
	}
	void m2() {
		int e = 4;
		int f = (a+b+e);
		System.out.println(f);
	}
}