package cn.xmu.changgu.myrandomnumberobserver;

import java.util.Observable;

public class DigitObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof RandomNumberGenerator generator) {
            System.out.println("DigitObserver:" + generator.getNumber());
        }
    }
}

