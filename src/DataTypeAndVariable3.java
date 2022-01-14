
public class DataTypeAndVariable3 {
	public static void main(String[] args) {

		int num = 5;
		num = 8;                        // num is now 20
		System.out.println(num);

		String str = "Greater Noida";
		str = "MyToshika";                    
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.replace("MyToshika", "Noida"));
		System.out.println(str.charAt(4));
		System.out.println(str.concat(" It Solution"));
		System.out.println(str.compareToIgnoreCase("MyToshikaa"));
		System.out.println(str.compareTo("MyToshika"));
		System.out.println(str.contains("T"));
		System.out.println(str.indexOf("s"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		String reverse = new StringBuffer(str).reverse().toString();
		System.out.println(reverse);
	}
}

