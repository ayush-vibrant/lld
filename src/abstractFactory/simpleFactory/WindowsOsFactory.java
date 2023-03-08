package abstractFactory.simpleFactory;

import abstractFactory.entity.button.Button;
import abstractFactory.entity.button.WindowsButton;
import abstractFactory.entity.checkbox.CheckBox;
import abstractFactory.entity.checkbox.WindowsCheckbox;

public class WindowsOsFactory implements OsFactory {
    @Override
    public Button createButton() {
        System.out.println("Creating Windows button");
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        System.out.println("Creating Windows checkbox");
        return new WindowsCheckbox();
    }
}
