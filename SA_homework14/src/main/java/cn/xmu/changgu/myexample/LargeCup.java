package cn.xmu.changgu.myexample;

class LargeCup extends CupSize {
    public LargeCup(CoffeeAdditive additive) {
        super(additive);
    }

    public void serve() {
        System.out.println("Serving large cup of coffee");
        additive.add();
    }
}
