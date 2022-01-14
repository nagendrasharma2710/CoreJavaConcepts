import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringHandling4 {
	public static void main(String[]args) {
		//String is converted into list of String
		//List of String is converted into String
		
		String cars = "polo,scoda,swift,creta,scorpio,safari";
		List<String> carList = Arrays.asList(cars.split(","));
		System.out.println("List of Cars : "+carList);

		List<String> mahindraBrands = Arrays.asList("XUV700","Thar","Scorpio","XUV500","XYLO");
		String car = mahindraBrands.stream().collect(Collectors.joining(","));
		System.out.print("Cars of Mahindra Brands are : " +car);

	}
}
