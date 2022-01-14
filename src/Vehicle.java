class Vehicle {
	public static void main(String [] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.Car();
		vehicle.Truck();
		Train train = new Train();
		train.bullet();
		train.passenger();
	} 
	public void Car() {
		System.out.println("this ia a car");
	}
	public void Truck() {
		System.out.println("this is a truck");
	}
}
class Train {
	public void bullet() {
		System.out.println("this is a bullet train");
	}
	public void passenger() {
		System.out.println("this is a passenger train");
	}
}