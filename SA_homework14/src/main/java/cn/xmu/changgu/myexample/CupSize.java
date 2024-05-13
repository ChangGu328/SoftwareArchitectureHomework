package cn.xmu.changgu.myexample;

abstract class CupSize {
    protected CoffeeAdditive additive;

    public CupSize(CoffeeAdditive additive) {
        this.additive = additive;
    }

    public abstract void serve();
}

