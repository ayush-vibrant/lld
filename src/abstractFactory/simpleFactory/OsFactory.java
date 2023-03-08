package abstractFactory.simpleFactory;

import abstractFactory.entity.button.Button;
import abstractFactory.entity.checkbox.CheckBox;

public interface OsFactory {
    Button createButton();

    CheckBox createCheckbox();
}
