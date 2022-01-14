package TestCoreConcepts;

import java.util.Scanner;
public class EmployeeCreator {

	Employee createEmployee() {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();

		System.out.println("Enter your Employee Id : ");
		Integer empId = sc.nextInt();
		emp.setId(empId);

		System.out.println("Enter your Employee First Name : ");
		String empFirstName = sc.next();
		emp.setFirstName(empFirstName);

		System.out.println("Enter your Employee Second Name : ");
		String empLastName = sc.next();
		emp.setLastName(empLastName);

		System.out.println("Enter your Employee Email : ");
		String empEmail = sc.next();
		emp.setEmail(empEmail);

		System.out.println("Enter your Employee Phone : ");
		Integer empPhone = sc.nextInt();
		emp.setPhone(empPhone);

		System.out.println("Enter your Employee Department : ");
		String empDepartment = sc.next();
		emp.setDepartment(empDepartment);

		System.out.println("Enter your Employee Gender : ");
		String empGender = sc.next();
		emp.setGender(empGender);

		System.out.println("Enter your Employee Address : ");
		String empAddress = sc.next();
		emp.setAddress(empAddress);
		
		return emp;
	}

}
