package cn.xmu.changgu.example.framework;

public interface Product extends Cloneable {
    void use(String s);

    Product createClone();
}