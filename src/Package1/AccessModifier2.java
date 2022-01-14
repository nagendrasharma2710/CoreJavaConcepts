package Package1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AccessModifier2 {
	public static void main(String []args) {

		AccessModifier1 access = new AccessModifier1();
		System.out.println(access.getN());
		System.out.println(access.getM());
		AccessModifier2 acce = new AccessModifier2();
		acce.str1();
		acce.str2();
	}
	private void str1() {
		String str = "jhon, david, mohan" ;
		List<String> sr = Arrays.asList(str.split(",")) ;
		System.out.println(sr);
	}
	private void str2() {
		List<String> srs = Arrays.asList("java,core,advance");
		String ss = srs.stream().collect(Collectors.joining(","));
		System.out.println(ss);
	}
}
