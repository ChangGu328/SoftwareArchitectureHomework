package cn.xmu.changgu.gumballstatewinner;

public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    void refill();
}
