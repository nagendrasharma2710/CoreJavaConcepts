
public class StringHandling2 {
	public static void main(String []args) {
		//Object is created by using literals(sequence of char) & Operation performed on it

		String str = "Nagendra";
		System.out.println(str);

		String str1 = "Nagendra";
		System.out.println(str1);

		str = str.concat(" Sharma ");
		System.out.println(str);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		str1 = str1.replace("Nagendra", "MyToshika");
		System.out.println(str1);
		System.out.println(str1.length());

		str1 = str1.concat(" It Solution ");
		System.out.println(str1);

		str1 = str1.concat("Greater Noida");
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println(str1.split(","));
	}
}
