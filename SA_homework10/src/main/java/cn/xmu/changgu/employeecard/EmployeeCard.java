package cn.xmu.changgu.employeecard;

import cn.xmu.changgu.framework.Product;

public class EmployeeCard extends Product {
    private final String owner;

    public EmployeeCard(String owner) {
        this.owner = owner;
        System.out.println("创建员工卡: " + owner);
    }

    @Override
    public void use() {
        System.out.println("使用员工卡: " + owner);
    }

    public String getOwner() {
        return owner;
    }
}
