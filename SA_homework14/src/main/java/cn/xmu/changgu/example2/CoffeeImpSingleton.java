package cn.xmu.changgu.example2;

public class CoffeeImpSingleton {
    private static CoffeeImp coffeeImp;

    public CoffeeImpSingleton(CoffeeImp coffeeImpIn) {
        coffeeImp = coffeeImpIn;
    }

    public static CoffeeImp getTheCoffeeImp() {
        return coffeeImp;
    }
}