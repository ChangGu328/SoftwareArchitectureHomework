package cn.xmu.changgu.idcard;

import cn.xmu.changgu.framework.Product;

public class IDCard extends Product {
    private final String owner;

    IDCard(String owner) {
        System.out.println("建立" + owner + "的卡。");
        this.owner = owner;
    }

    public void use() {
        System.out.println("使用" + owner + "的卡。");
    }

    public String getOwner() {
        return owner;
    }
}

