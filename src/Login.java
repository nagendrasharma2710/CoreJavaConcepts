import java.util.Scanner;

public class Login {
	public static void main(String []args) {
		Login lg = new Login(); 
		Registration registration = lg.inquiry();
		lg.show(registration);
	}
	public Registration inquiry() {
		Registration register = new Registration();
		System.out.println("Enter your Id :");
		Scanner sc = new Scanner(System.in);
		Integer id = sc.nextInt();
		register.setId(id);
		System.out.println("Enter your Name :");
		String name = sc.next();
		register.setName(name);
		System.out.println("Enter your Qualification");
		String qualification = sc.next();
		register.setQualification(qualification);
		System.out.println("Enter your Email");
		String email = sc.next();
		register.setEmail(email);
		System.out.println("Enter your Phone No.");
		Long phone = sc.nextLong();
		register.setPhone(phone);
		System.out.println("Enter your Gender");
		String gender = sc.next();
		register.setGender(gender);
		System.out.println("Enter your Address");
		String address = sc.next();
		register.setAddress(address);
		return register;
	}
	public Registration show(Registration registration) {
		System.out.println(registration);
		System.out.println("Login Successfully !!");
		return registration;
	}
}
