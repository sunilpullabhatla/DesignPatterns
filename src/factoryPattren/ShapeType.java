package factoryPattren;

public enum ShapeType {
	
	
	
	Circle("Circle"),Rectangle("Rectangle");
	
	private String val;
	
	ShapeType(String val){
		this.val = val;
	}
	
	public String getVal() {
		return val;
	}

}
