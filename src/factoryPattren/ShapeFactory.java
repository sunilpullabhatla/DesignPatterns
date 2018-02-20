package factoryPattren;

public class ShapeFactory {

	public Shape getShape(ShapeType type) {
		
		switch(type) {
		case Circle : return new Circle();
		case Rectangle : return new Rectangle();
		default : return null;
		}
		
	}
	
}
