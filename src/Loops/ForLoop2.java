package Loops;

public class ForLoop2 {
	public static void main(String []args) {
		int n = 0;
		for(int i=1; i<=10; i++) {
			n = n+i;
		}
		System.out.println("sum of numbers from 1 to 10 : " +n);
		nam();
		number();
	}
	static void number() {
		for(int i =1;i<=10; i++) {
			System.out.println(i);
		}
	}
	static void nam() {
     int r = 0;
     for(int i=1; i<=100; i++) {
    	 r = r+i;
     }
     System.out.println("sum of 1 to 100 numbers : "+r);
	}
}
