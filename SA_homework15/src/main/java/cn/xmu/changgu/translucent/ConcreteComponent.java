package cn.xmu.changgu.translucent;

// 具体的实现类
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent operation");
    }
}
