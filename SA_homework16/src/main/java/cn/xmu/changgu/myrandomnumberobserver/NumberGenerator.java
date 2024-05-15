package cn.xmu.changgu.myrandomnumberobserver;

import java.util.Observable;

public abstract class NumberGenerator extends Observable {
    public abstract int getNumber();

    public abstract void execute();
}

