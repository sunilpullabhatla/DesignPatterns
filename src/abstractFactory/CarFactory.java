package abstractFactory;

public class CarFactory implements AbstarctFactory {

	public Car getCar(String name) {
		if(name.equalsIgnoreCase("Hundai"))
			return new Hundai();
		else if(name.equalsIgnoreCase("Maruthi"))
			return new Maruthi();
		else
			return null;
	}

	@Override
	public Bike getBike(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
