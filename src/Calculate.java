
public class Calculate {

	public static void main(String []args) {
		Calculate cal = new Calculate();
		cal.checkEvenNo();
		cal.checkGreaterNo();
		cal.divide();
		cal.product();
	}
	public void checkEvenNo() {
		int n = 110;
		if(n % 2 == 0) {
			System.out.println("No is Even : " + n);
		}else {
			System.out.println("No is Odd");
		}
	}
	public void checkGreaterNo() {
		int p = 9;
		int q = 8;
		if(p>q) {
			System.out.println("P is greater : " + p);
		}else {
			System.out.println("Q is greater : " + q);
		}
	}
	public void divide() {
		int a = 4;
		int b = 12;
		int c = b/a;
		System.out.println("Division is : "+c);
	}
	public void product() {
		int x = 10;
		int y = 12;
		int z = x*y;
		System.out.println("Product is : "+z);
	}
}
