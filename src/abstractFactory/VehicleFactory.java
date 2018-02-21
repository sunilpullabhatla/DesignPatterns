package abstractFactory;

public class VehicleFactory {

	public static AbstarctFactory getVehicleFactory(String vehicle) {
		if(vehicle.equalsIgnoreCase("car")) {
			return new CarFactory();
		}
		else if(vehicle.equalsIgnoreCase("bike")) {
			return new BikeFactory();
		}else {
			return null;
		}
	}
}
