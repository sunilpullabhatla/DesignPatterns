package builderPattren;

public class Computer {

	private String brandName;
	private double processorSpeed;
	private double ramMemory;
	private double discMemory;
	private String os;
	
	public Computer setBrandName(String brandName) {
		this.brandName = brandName;
		return this;
	}
	public Computer setProcessorSpeed(double processorSpeed) {
		this.processorSpeed = processorSpeed;
		return this;
	}
	public Computer setRamMemory(double ramMemory) {
		this.ramMemory = ramMemory;
		return this;
	}
	public Computer setDiscMemory(double discMemory) {
		this.discMemory = discMemory;
		return this;
	}
	public Computer setOs(String os) {
		this.os = os;
		return this;
	}
	@Override
	public String toString() {
		return "Computer [brandName=" + brandName + ", processorSpeed=" + processorSpeed + ", ramMemory=" + ramMemory
				+ ", discMemory=" + discMemory + ", os=" + os + "]";
	}
	
	
}
