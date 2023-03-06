package decorator;

public class HighlightFeature implements EnhancedFeature {
    private final Feature feature;

    public HighlightFeature(Feature feature) {
        this.feature = feature;
    }

    @Override
    public String getDescription() {
        return feature.getDescription() + ", highlighted";
    }

    @Override
    public double getCost() {
        return feature.getCost() + 1.50;
    }
}
