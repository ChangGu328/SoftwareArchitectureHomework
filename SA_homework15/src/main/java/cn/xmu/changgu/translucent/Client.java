package cn.xmu.changgu.translucent;

// 测试代码
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        ConcreteDecorator decorator = new ConcreteDecorator(component);
        decorator.operation();
        decorator.extraOperation(); // 调用装饰器特有的方法
    }
}