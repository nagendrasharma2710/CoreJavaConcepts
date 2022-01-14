package Package1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class AccessModifier5 {
	public static void main(String []args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Messege : ");
		String input = sc.next();
		System.out.println(input);
 
		String str = "ram,shyam,mohan,sohan";
		List<String> name = Arrays.asList(str.split(","));
		System.out.println(name);
		String sss = name.stream().collect(Collectors.joining(","));
		System.out.println(sss);

		List<String> st = Arrays.asList("12,45,56,78,98");
		String s = st.stream().collect(Collectors.joining(","));
		System.out.println(s);
		List<String> ss = Arrays.asList(s.split(",")); 
		System.out.println(ss);
	}
}
