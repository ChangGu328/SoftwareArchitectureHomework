package cn.xmu.changgu.example.framework;

import java.util.Hashtable;

public class Manager {
    private final Hashtable showcase = new Hashtable();

    //建立名称和对象实例间的关系
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        //取出对象实例
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}
