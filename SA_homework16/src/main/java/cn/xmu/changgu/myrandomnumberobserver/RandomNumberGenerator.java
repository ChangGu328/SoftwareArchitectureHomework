package cn.xmu.changgu.myrandomnumberobserver;

import java.util.Observable;
import java.util.Random;

public class RandomNumberGenerator extends Observable {
    private final Random random = new Random();
    private int number;

    public int getNumber() {
        return number;
    }

    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            setChanged();
            notifyObservers();
        }
    }
}
