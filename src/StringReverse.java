
public class StringReverse {
	public static void main(String []args) {
		String str = "Nagendra";
		System.out.println(removeCharAt(str,5));
		reverseString();
		compareString();
	} 
	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos +1);
	}

	public static void reverseString() {
		String str1 = "Nagendra";
		String str2 = " Sharma";
		String reverse = new StringBuffer(str1).reverse().toString();
		System.out.println(reverse);
		System.out.println(str1.length());
		String str3 = str1.concat(str2);
		System.out.println(str3);
	}
	
	public static void compareString() {
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2); 
       
        int result = str1.compareToIgnoreCase(str2);
        if (result < 0)
        {
            System.out.println("\"" + str1 + "\"" +" is less than " +"\"" + str2 + "\"");
        }
        else if (result == 0)
        {
            System.out.println("\"" + str1 + "\"" + " is equal to " +  "\"" + str2 + "\"");
        }
        else 
        {
            System.out.println("\"" + str1 + "\"" +" is greater than " +"\"" + str2 + "\"");
        }
    }
}

