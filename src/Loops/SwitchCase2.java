package Loops;
import java.util.Scanner;

public class SwitchCase2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your choice : 1,2,3,4,5");
		System.out.println("Press 1 for Sum : ");
		System.out.println("Press 2 for Sub : ");
		System.out.println("Press 3 for Multiply : ");
		System.out.println("Press 4 for Division : ");
		System.out.println("Press 5 for Average : ");
		Integer num = sc.nextInt();
		if(num <=5) {
			System.out.println("Enter your first no : ");
			Integer n = sc.nextInt(); 
			System.out.println("Enter your second no : ");
			Integer m = sc.nextInt();

			switch(num) {
			case 1:
				System.out.println("Sum is : "+ (n+m));
				break;
			case 2: 
				System.out.println("Substraction is : "+ (n-m));
				break;
			case 3:
				System.out.println("Product is : " + (n*m));
				break;
			case 4:
				System.out.println("Division is : "+ (n/m));
				break;
			case 5:
				System.out.println("Average is : "+ (double)(n+m)/2);
				break;
			}
		}else {
			System.out.println("Invalid Request");
		}
	}
}