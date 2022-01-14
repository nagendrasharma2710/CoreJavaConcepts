import java.util.Arrays;
import java.util.List;

public class StringHandling3 {
	public static void main(String []args) {
		//Here we get the string which we want using indexing 
		//String is converted into list 

		String cars = "polo,scoda,swift,creta,scorpio";

		String cars_list[] = cars.split(",");
		String car1 = cars_list[0];
		String car2 = cars_list[1];
		String car3 = cars_list[2];
		String car4 = cars_list[3];
		String car5 = cars_list[4];

		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);
		System.out.println(car5);

		List<String> carList = Arrays.asList(cars.split(","));
		System.out.println("List of Cars : "+carList);

	}
}