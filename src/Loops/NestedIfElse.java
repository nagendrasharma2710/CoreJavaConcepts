package Loops;

public class NestedIfElse {
	public static void main(String []args) {
		String str  = "MyToshika,India";

		if(str.endsWith("India")) {
			if(str.contains("Noida")) {
				System.out.println("this is noida");
			} else if(str.contains("lucknow")) {
				System.out.println("this is lucknow");
			} else {
				System.out.println(str.split(",")[0]);
			}
		}else {
			System.out.println("You are not in india");	
		}
	}
}