package strategy;

public class ContextWithStrategy {
    private Strategy strategy;

    // this is known as constructor injection
    public ContextWithStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        strategy.doSomething();
    }
}
