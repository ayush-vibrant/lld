package abstractFactory.entity.checkbox;


public class MacCheckBox implements CheckBox {
    @Override
    public void pressCheckbox() {
        System.out.println("Pressing Mac checkbox");
    }
}
