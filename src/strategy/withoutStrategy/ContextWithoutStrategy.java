package strategy.withoutStrategy;

public class ContextWithoutStrategy {
    private int strategy;

    public ContextWithoutStrategy(int strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        switch (strategy) {
            case 1:
                System.out.println("strategy.withStrategy.Strategy 1");
                break;
            case 2:
                System.out.println("strategy.withStrategy.Strategy 2");
                break;
            case 3:
                System.out.println("strategy.withStrategy.Strategy 3");
                break;
            default:
                System.out.println("Default strategy");
                break;
        }
    }
}
