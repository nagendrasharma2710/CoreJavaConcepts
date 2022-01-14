import java.util.Scanner;

public class StringHandling6 {
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String str = sc.next();
		System.out.println(str);

		String umb = "Umbrella";
		System.out.println(umb.contains("m"));
		System.out.println(umb.charAt(6));
		System.out.println(umb.indexOf("e"));
//		for(int i=0;i<umb.length(); i++) {
//			if(umb.charAt(i) == 'e'){
//				System.out.println("yes");
//			}
//		}

		String  sr1 = "MyToshika It Solution 1";
		String  sr2 = "MyToshika It Solution 2";
		int strrr = sr1.compareTo(sr2);
		System.out.println(strrr);
	}
}
