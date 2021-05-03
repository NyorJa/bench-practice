package com.company.fact;

public class HtmlButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }

    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }
}
