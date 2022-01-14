package Package1;

class Ab {
	protected static String s = "MyToshika";
}
class Bc extends Ab {
}
class Cd extends Bc {   
	static void methodOfC() {
		System.out.println(s);
	}
}
public class AccessModifier8 {
	public static void main(String[] args) {
		Cd.methodOfC();
	}
}

