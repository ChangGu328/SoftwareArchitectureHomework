package cn.xmu.changgu;

public interface Strategy {
    Hand nextHand();

    void study(boolean win);
}
