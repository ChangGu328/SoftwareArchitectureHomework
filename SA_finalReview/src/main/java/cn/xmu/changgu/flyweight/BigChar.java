package cn.xmu.changgu.flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    // 字符名称
    private char charname;
    // 输出成大型文字的字串（有'#' '.' '\n'的行）
    private String fontdata;
    // 构造子
    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("big" + charname + ".txt"));
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }
    // 输出大型文字
    public void print() {
        System.out.print(fontdata);
    }
}

