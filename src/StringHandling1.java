
public class StringHandling1 {
	public static void main(String []args) { 
		//Object is created by using new keyword & Operation performed on it

		String str1 = new String("Ram");
		System.out.println(str1);

		String str2 = new String("Ram");
		System.out.println(str2);

		str1 = str1.concat(" Kumar ");
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());

		str2 = str2.replace("Ram", "MyToshika It Sol.");
		System.out.println(str2);
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str2.length());
	}
}
