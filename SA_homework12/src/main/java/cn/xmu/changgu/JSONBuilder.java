package cn.xmu.changgu;

import java.util.ArrayList;
import java.util.List;

public class JSONBuilder extends Builder {
    private final List<String> content = new ArrayList<>();

    public void makeTitle(String title) {
        content.add(String.format("{\"title\": \"%s\"}", title));
    }

    public void makeString(String str) {
        content.add(String.format("{\"string\": \"%s\"}", str));
    }

    public void makeItems(String[] items) {
        StringBuilder itemsJson = new StringBuilder("{\"items\": [");
        for (int i = 0; i < items.length; i++) {
            itemsJson.append(String.format("\"%s\"", items[i]));
            if (i < items.length - 1) {
                itemsJson.append(", ");
            }
        }
        itemsJson.append("]}");
        content.add(itemsJson.toString());
    }

    public Object getResult() {
        return String.join(", ", content);
    }
}
