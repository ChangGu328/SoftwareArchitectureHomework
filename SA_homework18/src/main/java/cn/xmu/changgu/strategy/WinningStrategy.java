package cn.xmu.changgu.strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private final Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy() {
        random = new Random();
    }

    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    public void study(boolean win) {
        won = win;
    }
}
