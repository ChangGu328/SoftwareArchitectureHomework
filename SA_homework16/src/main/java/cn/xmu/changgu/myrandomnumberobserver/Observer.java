package cn.xmu.changgu.myrandomnumberobserver;

import java.util.Observable;

public interface Observer extends java.util.Observer {
    void update(Observable o, Object arg);
}

