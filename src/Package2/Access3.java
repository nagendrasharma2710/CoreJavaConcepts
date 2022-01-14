package Package2;

import Package1.AccessModifier1;

public class Access3 extends AccessModifier1 {
	public static void main(String []args) {

		AccessModifier1 acc = new AccessModifier1();
		System.out.println(acc.getN());
		System.out.println(acc.getM());
		
	}
}
