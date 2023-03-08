package abstractFactory;

import abstractFactory.entity.button.Button;
import abstractFactory.entity.checkbox.CheckBox;
import abstractFactory.simpleFactory.OsFactory;

public class AbstractFactoryApplication {
    public static void main(String[] args) {
        OsFactory osFactory = GUIAbstractFactory.createFactory("Mac");
        Button button = osFactory.createButton();
        CheckBox macCheckBox = osFactory.createCheckbox();
        button.pressButton();
        macCheckBox.pressCheckbox();


        osFactory = GUIAbstractFactory.createFactory("Windows");
        Button windowsButton = osFactory.createButton();
        CheckBox checkbox = osFactory.createCheckbox();
        windowsButton.pressButton();
        checkbox.pressCheckbox();

    }
}
