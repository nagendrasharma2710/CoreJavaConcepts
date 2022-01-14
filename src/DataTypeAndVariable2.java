
public class DataTypeAndVariable2 {
	int n = 8;
	static int m = 4;
	public static void main(String []args) { 
		DataTypeAndVariable2 data = new DataTypeAndVariable2();
		System.out.println(data.n);
		System.out.println(data.m);
		
		data.n = 100;
		data.m = 200;
		System.out.println(data.n);
		System.out.println(data.m);

		DataTypeAndVariable2 data1 = new DataTypeAndVariable2();
		System.out.println(data1.n);
		System.out.println(data1.m);
	}
}
