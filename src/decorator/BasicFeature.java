package decorator;

public class BasicFeature implements Feature {
    private final String description;
    private final double cost;

    public BasicFeature(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}

