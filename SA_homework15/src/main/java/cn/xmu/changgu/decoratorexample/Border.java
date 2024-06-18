package cn.xmu.changgu.decoratorexample;

public abstract class Border extends Display {
    protected Display display;          // 指装饰外框里面的「內容」
    protected Border(Display display) { // 在产生对象实例时，以参数指定「內容」
        this.display = display;
    }
}

