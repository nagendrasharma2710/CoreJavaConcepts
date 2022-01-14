import java.util.Scanner;

public class DataTypeAndVariable6 {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter only 6 digit OTP No :");
		int ns = sc.nextInt();
		int n1 = ns/100000 %10 ;
		int n2 = ns/10000 %10 ;
		int n3 = ns/1000 %10 ;
		int n4 = ns/100 %10 ;
		int n5 = ns/10 %10 ;
		int n6 = ns %10 ;
		
		System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);
	
	}
}
