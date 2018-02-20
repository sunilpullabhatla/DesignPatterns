package builderPattren;

public class ComputerDriver {
public static void main(String[] args) {
	Computer comp = new Computer();
	
	comp.setBrandName("HCL").setDiscMemory(64).setRamMemory(4).setProcessorSpeed(2).setOs("Windows");
	
	System.out.println(comp);
}
}
