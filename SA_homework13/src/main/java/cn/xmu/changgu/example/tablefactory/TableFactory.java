package cn.xmu.changgu.example.tablefactory;

import cn.xmu.changgu.example.factory.Factory;
import cn.xmu.changgu.example.factory.Link;
import cn.xmu.changgu.example.factory.Page;
import cn.xmu.changgu.example.factory.Tray;

public class TableFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
