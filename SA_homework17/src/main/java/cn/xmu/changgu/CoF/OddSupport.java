package cn.xmu.changgu.CoF;

public class OddSupport extends Support {
    public OddSupport(String name) {                // 构造子
        super(name);
    }

    protected boolean resolve(Trouble trouble) {    // 解决的方法
        return trouble.getNumber() % 2 == 1;
    }
}

