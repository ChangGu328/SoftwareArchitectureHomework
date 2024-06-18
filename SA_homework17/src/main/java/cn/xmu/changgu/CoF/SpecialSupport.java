package cn.xmu.changgu.CoF;

public class SpecialSupport extends Support {
    private final int number;                                 // 只能解决此号码的问题

    public SpecialSupport(String name, int number) {    // 构造子
        super(name);
        this.number = number;
    }

    protected boolean resolve(Trouble trouble) {     // 解决的方法
        return trouble.getNumber() == number;
    }
}

