package cn.xmu.changgu.CoF;

public class LimitSupport extends Support {
    private final int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}

