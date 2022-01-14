
public class Employee {
	public static void main(String[] args) {
		Employee em = new Employee();
		em.emp1(11);
		em.emp2("MyToshika");
		emp("ram", 111);
		emp("John", 112);
		emp("david", 113);
	}
	public int emp1(int id) {
		System.out.println(id);
		return id;
	}
	public String emp2(String name) {
		System.out.println(name);
		return name;
	}
	public static void emp(String name, int id) {
		System.out.println(name + " : " + id);
	}
}