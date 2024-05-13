package cn.xmu.changgu.myexample;

class MediumCup extends CupSize {
    public MediumCup(CoffeeAdditive additive) {
        super(additive);
    }

    public void serve() {
        System.out.println("Serving medium cup of coffee");
        additive.add();
    }
}