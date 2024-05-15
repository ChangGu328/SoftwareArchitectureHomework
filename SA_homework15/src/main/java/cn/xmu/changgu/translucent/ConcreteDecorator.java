package cn.xmu.changgu.translucent;

// 具体的装饰器类，添加了新的方法
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    private void addedBehavior() {
        System.out.println("ConcreteDecorator added behavior");
    }

    public void extraOperation() {
        System.out.println("ConcreteDecorator extra operation");
    }
}