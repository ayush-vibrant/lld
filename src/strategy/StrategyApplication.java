package strategy;

import strategy.withStrategy.ContextWithStrategy;
import strategy.withStrategy.StrategyA;
import strategy.withStrategy.StrategyB;

public class StrategyApplication {
    public static void main(String[] args) {
        ContextWithStrategy context = new ContextWithStrategy(new StrategyA());
        context.doSomething();
        context = new ContextWithStrategy(new StrategyB());
        context.doSomething();
    }

}
