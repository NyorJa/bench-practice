package com.company.abs.fact;

public class Demo {
    private static Application configureApplication() {
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory guiFactory = osName.contains("mac") ? new MacOSFactory() : new WindowsFactory();
        return new Application(guiFactory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
