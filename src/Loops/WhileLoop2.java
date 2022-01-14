package Loops;
import java.util.Scanner;

public class WhileLoop2 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("select choice : 1,2");
		Integer num = sc.nextInt();

		switch(num) {
		case 1:
			int i = 2;    
			while(i<=10) {    
				System.out.println(i);    
				i = i + 2;  
			}
			break;
		case 2:
			System.out.println("Table of 4 : ");
			for(int j=1; j<45; j++) {
				j=j+3;
				System.out.println(+j);
				if(j==40) {
					break;
				}
			}
		}
	}
}


