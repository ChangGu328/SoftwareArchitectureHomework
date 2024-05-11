package cn.xmu.changgu.myexample.macosfactory;

import cn.xmu.changgu.myexample.factory.TextBox;

// MacOS 文本框实现
public class MacOSTextBox implements TextBox {
    public void paint() {
        System.out.println("Rendering a text box in MacOS style.");
    }
}