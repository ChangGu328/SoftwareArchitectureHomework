package cn.xmu.changgu.myexample.windowsfactory;

import cn.xmu.changgu.myexample.factory.TextBox;

// Windows 文本框实现
public class WindowsTextBox implements TextBox {
    public void paint() {
        System.out.println("Rendering a text box in Windows style.");
    }
}
