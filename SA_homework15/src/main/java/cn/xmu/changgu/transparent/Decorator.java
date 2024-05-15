package cn.xmu.changgu.transparent;

// 装饰器基类，实现了相同的接口
public class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
