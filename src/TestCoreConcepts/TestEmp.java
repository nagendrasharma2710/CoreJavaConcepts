package TestCoreConcepts;

public class TestEmp {
	public static void main(String []args) {
		EmployeeCreator cemp = new EmployeeCreator();
		Employee emp =cemp.createEmployee();
		System.out.println(emp);
        System.out.println(emp.getFirstName());		 

	}
}
