package prototypePattren;

public class PrototypeDriver {

	
	public static void main(String[] args) throws Exception {
	
		
		ShapePrototype sp = new ShapePrototype();
		sp.initialLoader();
		
		System.out.println(sp.getShape("circle"));
		System.out.println(sp.getShape("rectangle"));
		
	}
	
}
