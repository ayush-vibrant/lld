package abstractFactory.entity.button;

public class MacButton implements Button {
    @Override
    public void pressButton() {
        System.out.println("Pressing Mac button");
    }
}
