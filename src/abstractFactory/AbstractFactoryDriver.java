package abstractFactory;

public class AbstractFactoryDriver {

	
	
	public static void main(String[] args) {
		
		AbstarctFactory af = VehicleFactory.getVehicleFactory("car");
		
		Car car = af.getCar("Maruthi");
		car.drive();
		
		car = af.getCar("Hundai");
		car.drive();
		
		af = VehicleFactory.getVehicleFactory("Bike");
		
		Bike bike = af.getBike("RoyalEnfield");
		bike.drive();
		
		bike = af.getBike("Yamaha");
		bike.drive();
		
		
	}
	
	
	
	
}
