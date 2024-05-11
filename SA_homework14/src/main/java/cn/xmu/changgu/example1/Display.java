package cn.xmu.changgu.example1;

public class Display {
    private final DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public final void display() { //template method here
        open();
        print();
        close();
    }
}
