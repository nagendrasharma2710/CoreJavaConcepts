package Loops;

public class ForEachLoop1 {
	public static void main(String []args) {
		Integer[] inte = {34,45,56,78};
		for(Integer integer : inte) {
			System.out.println(integer);
		}
		ForEachLoop1 loop = new ForEachLoop1();
		loop.listOfName();
	}
	void listOfName() {
		String[] names = {"thar","safari","defender","fortuner"};	
		for(String name : names) {
			System.out.println(name);
		}
	}
}

