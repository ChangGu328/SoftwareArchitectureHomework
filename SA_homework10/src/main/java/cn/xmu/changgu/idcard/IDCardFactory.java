package cn.xmu.changgu.idcard;

import cn.xmu.changgu.framework.Factory;
import cn.xmu.changgu.framework.Product;

import java.util.Vector;

public class IDCardFactory extends Factory {
    private final Vector owners = new Vector();

    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public Vector getOwners() {
        return owners;
    }
}
