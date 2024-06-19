package cn.xmu.changgu.proxyeaxmple;

public interface Printable {
    String getPrinterName();            // 取得名称

    void setPrinterName(String name);   // 命名

    void print(String string);          // 输出字串（打印）
}

