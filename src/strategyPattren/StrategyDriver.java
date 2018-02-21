package strategyPattren;

public class StrategyDriver  {

	public static void main(String[] args) {
		
		MultiStrategies strategy = new MultiStrategies(new AdditionStrategy());
		System.out.println(strategy.executeStrategy(20, 10));
		
		strategy = new MultiStrategies(new SubtractionStrategy());
		System.out.println(strategy.executeStrategy(20, 10));
	}

	
}
