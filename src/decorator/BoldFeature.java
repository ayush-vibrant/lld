package decorator;

public class BoldFeature implements EnhancedFeature {
    private final Feature feature;

    public BoldFeature(Feature feature) {
        this.feature = feature;
    }

    @Override
    public String getDescription() {
        return feature.getDescription() + ", bolded";
    }

    @Override
    public double getCost() {
        return feature.getCost() + 1.00;
    }
}
