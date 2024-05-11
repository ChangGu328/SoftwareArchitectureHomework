package cn.xmu.changgu.employeecard;

import cn.xmu.changgu.framework.Factory;
import cn.xmu.changgu.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCardFactory extends Factory {
    private final List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new EmployeeCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((EmployeeCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
