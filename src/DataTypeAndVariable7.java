
public class DataTypeAndVariable7 {

	int x=5;
	static int y=8;
	public static void main(String []args) {
		DataTypeAndVariable7 data = new DataTypeAndVariable7();
		data.area();
		data.perimeter();
	}
	void area() {
		int z= (x*y);
		System.out.println(z);
	}
	void perimeter() {
		int s = (2*(x+y));
		System.out.println(s);
	}
}

