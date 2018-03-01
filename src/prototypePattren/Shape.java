package prototypePattren;

public abstract class Shape implements Cloneable {
	

	String type;
	public abstract void draw();
	
	
		
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}


}
