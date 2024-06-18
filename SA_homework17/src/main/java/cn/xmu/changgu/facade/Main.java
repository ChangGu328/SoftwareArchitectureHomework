package cn.xmu.changgu.facade;

import cn.xmu.changgu.facade.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("student@xmu.edu.cn", "welcome.html");
    }
}
