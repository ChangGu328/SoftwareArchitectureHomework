package cn.xmu.changgu.randomnumberexample;

import java.util.Iterator;
import java.util.Vector;

public abstract class NumberGenerator {
    private final Vector observers = new Vector();        // 储存Observer

    public void addObserver(Observer observer) {    // 新增Observer
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) { // 刪除Observer
        observers.remove(observer);
    }

    public void notifyObservers() {               // 通知Observer
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer) it.next();
            o.update(this);
        }
    }

    public abstract int getNumber();                // 取得数值

    public abstract void execute();                 // 产生数值
}

