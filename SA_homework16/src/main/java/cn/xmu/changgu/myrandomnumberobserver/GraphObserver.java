package cn.xmu.changgu.myrandomnumberobserver;

import java.util.Observable;

public class GraphObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof RandomNumberGenerator generator) {
            int count = generator.getNumber();
            System.out.print("GraphObserver:");
            for (int i = 0; i < count; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

