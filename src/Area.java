import java.util.Scanner;

public class Area {
 public static void main(String [] args) {
	 Area area = new Area();
	 System.out.println("Enter Lenght : ");
	 Scanner sc = new Scanner(System.in);
	 Integer lenght = sc.nextInt();
	 System.out.println("Enter Breath : ");
	 Integer breath = sc.nextInt();
	 area.setDim(lenght, breath);
	 area.getArea(lenght, breath);
 }
 public void setDim(int lenght, int breath) {
	 int l = lenght;
	 int b = breath;
 }
 public void getArea(int lenght , int breath) {
	 System.out.println("Area of Rectangle : " + lenght*breath);
 }
}
