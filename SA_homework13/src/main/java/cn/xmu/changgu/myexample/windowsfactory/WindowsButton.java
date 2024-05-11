package cn.xmu.changgu.myexample.windowsfactory;

import cn.xmu.changgu.myexample.factory.Button;

// Windows 按钮实现
public class WindowsButton implements Button {
    public void paint() {
        System.out.println("Rendering a button in Windows style.");
    }
}

