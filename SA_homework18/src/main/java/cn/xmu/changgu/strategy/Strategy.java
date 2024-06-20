package cn.xmu.changgu.strategy;

public interface Strategy {
    Hand nextHand();

    void study(boolean win);
}
