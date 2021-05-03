package com.company.abs.fact;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
