import java.util.Scanner;

public class Demo {
	public static void main(String [] args) {
		Demo demo = new Demo();
		UserDetail userDetail = demo.user();
		System.out.println(userDetail.toString());
	         demo.show(userDetail);
	         demo.displayName(userDetail);
	}
	public UserDetail user() {
		UserDetail users = new UserDetail();
		System.out.println("Enter your Id :");
		Scanner sc = new Scanner(System.in);
		Integer id = sc.nextInt();
		users.setId(id);
		System.out.println("Enter your Name :");
		String name = sc.next();
		users.setName(name);
		System.out.println("Enter your Email :");
		String email = sc.next();
		users.setEmail(email);
		return users;
	}
    public UserDetail show(UserDetail userss) {
    	System.out.println(userss.toString());
    	return userss;
    }
    public UserDetail displayName(UserDetail userName) {
    	System.out.println(userName.getName());
    	return userName;
    } 
}
