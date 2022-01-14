package Loops;

public class ForEachLoop2 {
	public static void main(String[] args) {
		char[] vwl = {'a', 'e', 'i', 'o', 'u'};
		for (int i = 0; i < vwl.length; i++) {
			System.out.println(vwl[i]);
		}
		int[] in = {11,22,33,44};
		for(Integer rol : in) {
			System.out.println(rol);
		}
		String[] str = {"john","ram","mohan","smith"};
		for(String strng : str) {
			System.out.println(strng);
		}
	}
}
