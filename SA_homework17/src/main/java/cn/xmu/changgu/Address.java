package cn.xmu.changgu;

public class Address {
    private Street street;

    public Street getStreet() {
        return street;
    }

    public String getStreetName() {
        return street.getName();
    }
}

