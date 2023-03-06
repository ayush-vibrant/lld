package factory;

public class ShapeFactory {
    Shape shape;

    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "CIRCLE":
                shape = new Circle();
                break;
            case "RECTANGLE":
                shape = new Rectangle();
                break;
            case "TRIANGLE":
                shape = new Triangle();
                break;
            default:
                shape = null;
                break;
        }
        return shape;
    }
}
