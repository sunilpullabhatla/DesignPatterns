package abstractFactory;

public class BikeFactory  implements AbstarctFactory {

	public  Bike getBike(String name) {
		if(name.equalsIgnoreCase("RoyalEnfield"))
			return new RoyalEnfield();
		else if(name.equalsIgnoreCase("Yamaha"))
			return new Yamaha();
		else
			return null;
	}

	@Override
	public Car getCar(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
