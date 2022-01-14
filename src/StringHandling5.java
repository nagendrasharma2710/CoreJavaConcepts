
public class StringHandling5 {
	public static void main(String[] args) {
		//find the position of the given string

		String str = "MyToshika It Solution, Noida";
		System.out.println("String is : " + str);

		int index1 = str.charAt(0);
		int index2 = str.charAt(14);

		System.out.println("Character at position 0 : " + (char)index1);
		System.out.println("Character at position 14 : " + (char)index2);

		System.out.println("Character at position 5 : " + str.charAt(5));
		System.out.println("Character at position 20 : " + str.charAt(20));
		System.out.println("Total characters in the string : " + str.length());
	}
}


