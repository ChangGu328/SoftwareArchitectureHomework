package cn.xmu.changgu.myrandomnumberobserver;

public class Main {
    public static void main(String[] args) {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        Observer digitObserver = new DigitObserver();
        Observer graphObserver = new GraphObserver();
        generator.addObserver(digitObserver);
        generator.addObserver(graphObserver);
        generator.execute();
    }
}
