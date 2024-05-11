package cn.xmu.changgu.myexample.macosfactory;

import cn.xmu.changgu.myexample.factory.Button;

// MacOS 按钮实现
public class MacOSButton implements Button {
    public void paint() {
        System.out.println("Rendering a button in MacOS style.");
    }
}
