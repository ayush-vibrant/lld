package strategy;

public class StrategyApplication {
    public static void main(String[] args) {
        ContextWithStrategy context = new ContextWithStrategy(new StrategyA());
        context.doSomething();
        context = new ContextWithStrategy(new StrategyB());
        context.doSomething();
    }

}
