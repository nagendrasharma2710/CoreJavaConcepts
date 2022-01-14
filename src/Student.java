import java.util.Arrays;
import java.util.List;

public class Student {
	static List<String> name = Arrays.asList("jhon","ram","smith");
	static List<Integer> id = Arrays.asList(12,13,14);

	public static void main(String [] args) {
		Student stu = new Student();
		stu.studentList(name);
		stu.studentTop(id);
	}
	public List<String> studentList(List<String> newStudent) {
		System.out.println("Names of Students :" + newStudent);
		return newStudent;
	}
	public List<Integer> studentTop(List<Integer> studentId) {
		System.out.println("Id's of Students :" + studentId);
		return studentId;
	}
}
