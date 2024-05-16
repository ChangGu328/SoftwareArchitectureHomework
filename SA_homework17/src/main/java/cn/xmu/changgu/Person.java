package cn.xmu.changgu;

public class Person {
    private Address address;

    public Person(Address address) {
        this.address = address;
    }

    public void printStreetName() {
        System.out.println("Street Name: " + address.getStreetName());
    }
}