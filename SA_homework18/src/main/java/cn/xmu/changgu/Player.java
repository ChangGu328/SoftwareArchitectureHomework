package cn.xmu.changgu;

public class Player {
    private final String name;
    private final Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;

    public Player(String name, Strategy strategy) {         // 得到姓名和战略
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {                                // 向战略请示手势
        return strategy.nextHand();
    }

    public void win() {                 // 猜贏
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose() {                // 猜输
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void even() {                // 平手
        gameCount++;
    }

    public String toString() {
        return name + ": " + gameCount + " games, " + winCount + " win, " + loseCount + " lose";
    }
}
