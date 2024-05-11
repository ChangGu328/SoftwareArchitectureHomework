package cn.xmu.changgu;

import cn.xmu.changgu.framework.Factory;
import cn.xmu.changgu.framework.Product;
import cn.xmu.changgu.idcard.IDCardFactory;
import cn.xmu.changgu.employeecard.EmployeeCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory idCardFactory = new IDCardFactory();
        Product idCard1 = idCardFactory.create("乔峰");
        Product idCard2 = idCardFactory.create("令狐冲");
        Product idCard3 = idCardFactory.create("武松");
        idCard1.use();
        idCard2.use();
        idCard3.use();

        System.out.println("---");

        Factory employeeCardFactory = new EmployeeCardFactory();
        Product employeeCard1 = employeeCardFactory.create("小张");
        Product employeeCard2 = employeeCardFactory.create("小李");
        employeeCard1.use();
        employeeCard2.use();
    }
}
