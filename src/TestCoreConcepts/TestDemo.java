package TestCoreConcepts;

public class TestDemo {

	public static void main(String []args) {
		TestDemo ob = new TestDemo();
		String td = ob.concate("101","shyam");
		System.out.println(td);
	} 

	String concate(String name1, String name2) {
		String str = name1.concat("_").concat(name2);
		return str;	
	}
}