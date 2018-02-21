package factoryPattren;

public class FactoryDriver {
public static void main(String[] args) {
	ShapeFactory sf = new ShapeFactory();
	
	Shape shape1 = sf.getShape(ShapeType.Circle);
	shape1.draw();
	
	Shape shape2 = sf.getShape(ShapeType.Rectangle);
	shape2.draw();
	
		
}
}
