package abstractFactory.entity.checkbox;


public class WindowsCheckbox implements CheckBox {
    @Override
    public void pressCheckbox() {
        System.out.println("Pressing Windows checkbox");
    }
}
