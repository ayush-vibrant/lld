package decorator;

public class DecoratorApplication {
    public static void main(String[] args) {
        Feature basicFeature = new BasicFeature("basic feature", 10.0);
        print(basicFeature);

        EnhancedFeature highlightFeature = new HighlightFeature(basicFeature);
        print(highlightFeature);

        EnhancedFeature enhancedFeature = new BoldFeature(highlightFeature);
        print(enhancedFeature);
    }

    private static void print(Feature feature) {
        System.out.println(feature.getDescription());
        System.out.println(feature.getCost());
    }
}
