package decorator;

public class DecoratorApplication {
    public static void main(String[] args) {
        Feature feature = new BasicFeature();
        feature.doSomething();
        System.out.println("--------------------");

        feature = new EnhancedFeatureA(new BasicFeature());
        feature.doSomething();
        System.out.println("--------------------");


        feature = new EnhancedFeatureB(new EnhancedFeatureA(new BasicFeature()));
        feature.doSomething();
        System.out.println("--------------------");
    }
}
