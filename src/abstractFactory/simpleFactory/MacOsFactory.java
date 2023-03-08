package abstractFactory.simpleFactory;

import abstractFactory.entity.button.Button;
import abstractFactory.entity.button.MacButton;
import abstractFactory.entity.checkbox.CheckBox;
import abstractFactory.entity.checkbox.MacCheckBox;

public class MacOsFactory implements OsFactory {
    @Override
    public Button createButton() {
        System.out.println("Creating Mac button");
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        System.out.println("Creating Mac checkbox");
        return new MacCheckBox();
    }
}
