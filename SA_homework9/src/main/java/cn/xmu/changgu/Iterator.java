package cn.xmu.changgu;

public interface Iterator {
    //hasNext方法用于检查有无下一个元素
    boolean hasNext();

    //next方法返回聚合当中的一个元素
    Object next();
}
