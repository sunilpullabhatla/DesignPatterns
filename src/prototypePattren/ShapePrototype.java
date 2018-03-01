package prototypePattren;

public class ShapePrototype {

	
	Circle circle;
	Rectangle rectangle;
	
	public void initialLoader() {
		 circle = new Circle();
		circle.type = "circle";
		
		rectangle = new Rectangle();
		rectangle.type = "rectangle";
		
		
		
	}
	
	public Shape getShape(String type) throws Exception {
		
		
		if(type.equalsIgnoreCase("circle")) {
		
			return (Shape) circle.clone();
			
		}else {
			
			return (Shape) rectangle.clone();
		}
		
	}
	
}
