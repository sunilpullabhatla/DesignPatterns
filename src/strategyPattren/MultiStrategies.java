package strategyPattren;

public class MultiStrategies {

	private Strategy strategy;

	MultiStrategies(Strategy strategy) {
		this.strategy = strategy;
	}

	public double executeStrategy(double num1, double num2) {
		return strategy.applyStrategy(num1, num2);
	}

}
