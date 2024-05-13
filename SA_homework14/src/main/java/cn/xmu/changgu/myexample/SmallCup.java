package cn.xmu.changgu.myexample;

class SmallCup extends CupSize {
    public SmallCup(CoffeeAdditive additive) {
        super(additive);
    }

    public void serve() {
        System.out.println("Serving small cup of coffee");
        additive.add();
    }
}