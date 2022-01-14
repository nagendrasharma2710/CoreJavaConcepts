import java.util.Scanner;

public class NewCalculator {
	public static void main(String[] args) {

		char choice;
		int n, m, result;

		Scanner sc = new Scanner(System.in);
		System.out.println("Select your choice : 1, 2, 3, 4");
	    choice = sc.next().charAt(0);

		System.out.println("Enter first number :");
		n = sc.nextInt();
		System.out.println("Enter second number :");
		m = sc.nextInt();

		switch (choice) {
		case '1':
			result = n + m;
			System.out.println("Sum is : " +result);
			break;

		case '2':
			result = n - m;
			System.out.println("Substratction is : " + result);
			break;

		case '3':
			result = n * m;
			System.out.println("Multiplication is : " + result);
			break;

		case '4':
			result = m / n;
			System.out.println("Division is : " + result);
			break;
            
		default:
			System.out.println("Wrong Choice");
			break;
		}
		sc.close();
	}
}