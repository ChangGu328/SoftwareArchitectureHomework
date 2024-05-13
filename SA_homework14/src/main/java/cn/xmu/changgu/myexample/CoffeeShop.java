package cn.xmu.changgu.myexample;

public class CoffeeShop {
    public static void main(String[] args) {
        CupSize smallWithMilk = new SmallCup(new Milk());
        smallWithMilk.serve();

        CupSize largeWithSugar = new LargeCup(new Sugar());
        largeWithSugar.serve();

        CupSize mediumPlain = new MediumCup(new Plain());
        mediumPlain.serve();
    }
}
