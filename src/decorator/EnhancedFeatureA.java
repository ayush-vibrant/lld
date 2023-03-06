package decorator;

public class EnhancedFeatureA implements Feature {
    private Feature feature;

    public EnhancedFeatureA(Feature feature) {
        this.feature = feature;
    }

    public void doSomething() {
        feature.doSomething();
        System.out.println("Feature A");
    }

}
