package cn.xmu.changgu.myexample.windowsfactory;

import cn.xmu.changgu.myexample.factory.Button;
import cn.xmu.changgu.myexample.factory.GUIFactory;
import cn.xmu.changgu.myexample.factory.TextBox;

// Windows 工厂
public class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}
