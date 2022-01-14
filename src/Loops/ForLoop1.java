package Loops;

public class ForLoop1 {
	public static void main(String []args) {

		System.out.println("Even numbers are : ");
		for(int i=1; i<=5; i++) {
			System.out.println(2*i);
		}

		System.out.println("Odd numbers are : ");
		for(int j=0; j<5; j++) {
			System.out.println(2*j+1);
		}
		
		System.out.println("numbers are in reverse order : ");
		for(int i =10; i>0; i--) {
			System.out.println(i);
			if(i==5) {
		//		System.out.println(i);
				break;
			}
		}
	}
}
