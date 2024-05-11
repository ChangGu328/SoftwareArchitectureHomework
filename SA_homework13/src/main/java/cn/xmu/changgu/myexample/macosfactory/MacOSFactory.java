package cn.xmu.changgu.myexample.macosfactory;

import cn.xmu.changgu.myexample.factory.Button;
import cn.xmu.changgu.myexample.factory.GUIFactory;
import cn.xmu.changgu.myexample.factory.TextBox;

// MacOS 工厂
public class MacOSFactory implements GUIFactory {
    public Button createButton() {
        return new MacOSButton();
    }

    public TextBox createTextBox() {
        return new MacOSTextBox();
    }
}
