import java.util.Scanner;

public class DataTypeAndVariable4 {

	    public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter your first number : ");
	        int f = in.nextInt();
	        System.out.print("Enter your second number : ");
	        int s = in.nextInt();

	        System.out.printf("Sum of two Numbers are : %d%n", f + s);
	        System.out.printf("Substration of two Numbers: %d%n", f - s);
	        System.out.printf("Multiplication of two Numbers: %d%n", f * s);
	        System.out.printf("Division of two Numbers: %d%n",f / s);
	        System.out.printf("Average of two Numbers: %.2f%n", (double) (f + s) / 2);
	        System.out.printf("Average of two Numbers: %d%n", (f + s) / 2);
	    }
	}

