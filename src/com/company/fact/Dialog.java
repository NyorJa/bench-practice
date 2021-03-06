package com.company.fact;

public abstract class Dialog {

    public abstract Button createButton();

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }
}
