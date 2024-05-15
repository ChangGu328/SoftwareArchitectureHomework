package cn.xmu.changgu.transparent;

// 测试代码
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component decorator = new ConcreteDecorator(component);
        decorator.operation();
    }
}
