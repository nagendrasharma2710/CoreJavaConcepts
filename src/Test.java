import java.util.Arrays;
import java.util.List;

public class Test {
	static List<String> companies = Arrays.asList("MyToshika","SoftWare","Company","Greater Noida");
	static String name1 = "MyToshika";

	public static void main(String []args) {
		software(name1);
		company(companies);
	}
	public static String software(String name1) {
		System.out.println(name1);
		return name1;
	}
	public static List<String> company(List<String> companies) {
		System.out.println(companies);
		return companies;
	}
}
