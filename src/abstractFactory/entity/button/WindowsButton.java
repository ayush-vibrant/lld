package abstractFactory.entity.button;

public class WindowsButton implements Button {

    @Override
    public void pressButton() {
        System.out.println("Pressing Windows button");
    }

}
