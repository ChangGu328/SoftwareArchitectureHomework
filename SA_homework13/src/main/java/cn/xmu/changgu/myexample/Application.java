package cn.xmu.changgu.myexample;

import cn.xmu.changgu.myexample.factory.Button;
import cn.xmu.changgu.myexample.factory.GUIFactory;
import cn.xmu.changgu.myexample.factory.TextBox;
import cn.xmu.changgu.myexample.macosfactory.MacOSFactory;
import cn.xmu.changgu.myexample.windowsfactory.WindowsFactory;

public class Application {
    private Button button;
    private TextBox textBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        textBox = factory.createTextBox();
    }

    public void paint() {
        button.paint();
        textBox.paint();
    }

    public static void main(String[] args) {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }
        Application app = new Application(factory);
        app.paint();
    }
}
