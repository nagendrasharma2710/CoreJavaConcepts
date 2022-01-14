
public class Car {
  int carNo;
  String brand;
  
  public void initCar(int n, String str) {
	   carNo = n;
	   brand = str;
  }
  public void show() {
	  System.out.println(carNo+" "+brand);
  }
  public static void main(String []args) {
	  Car car = new Car();
	  car.initCar(4546, "polo");
	  car.show();
  }
}
