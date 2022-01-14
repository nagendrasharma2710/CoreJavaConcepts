package Package1;

public class AccessModifier3 {
	private int r ;
	protected int s ;

	private void area (int r , int s) {
	    int lenght = r;
		int breath = s;
		System.out.println("Area of Rectangle : "+r*s);
	}

	protected void perimeter (int r , int s) {
		int lenght = r;
		int breath = s;
		System.out.println("Perimeter of Rectangle : "+2*(r+s));
	}

	public static void main(String []args) {
		AccessModifier3 ac= new AccessModifier3();
		ac.area(7, 4);
		ac.perimeter(6, 9);
	}
}
