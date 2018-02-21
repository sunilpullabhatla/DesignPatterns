package factoryPattren;

public enum ShapeType {
	
	
	
	Circle("Circle"),Rectangle("Rectangle");
	
	private String val;
	
	ShapeType(String val){
		this.val = val;
		System.out.println("Constructor called");
	}
	
	public String getVal() {
		return val;
	}

}
