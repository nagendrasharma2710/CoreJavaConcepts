import java.util.Scanner;

public class DataTypeAndVariable5 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first no. ");
		int r = sc.nextInt();
		System.out.println("enter second no .");
		int s = sc.nextInt();
		
        System.out.printf("Max Number: %d%n", Math.max(r, s));
        System.out.printf("Min Number: %d%n", Math.min(r, s));
	}
}
