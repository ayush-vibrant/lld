package decorator;

public class EnhancedFeatureB implements Feature {
    private Feature feature;

    public EnhancedFeatureB(Feature feature) {
        this.feature = feature;
    }

    public void doSomething() {
        feature.doSomething();
        System.out.println("decorator.EnhancedFeature B");
    }
}

