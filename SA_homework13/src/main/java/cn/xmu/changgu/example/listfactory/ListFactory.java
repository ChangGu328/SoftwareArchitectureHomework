package cn.xmu.changgu.example.listfactory;

import cn.xmu.changgu.example.factory.Factory;
import cn.xmu.changgu.example.factory.Link;
import cn.xmu.changgu.example.factory.Page;
import cn.xmu.changgu.example.factory.Tray;

public class ListFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
