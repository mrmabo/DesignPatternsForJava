package Flyweight.hm;

import java.awt.Image;

public class FlyweightClient {
    static Image i1, i2, i3, i4, i5;
    private static final Image locationMap[] = {i1, i2, i3, i4, i5};
    private static Customer customer;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ConcreteFlyweight concreteflyweight = (ConcreteFlyweight) FlyweightFactory.getCustomer(locationMap[i]);
            concreteflyweight.setCustomerId(customer.getCustomerId());
            concreteflyweight.setFirstName(customer.getFirstName());
            concreteflyweight.setLastName(customer.getLastName());
            concreteflyweight.setResidenceAddress(customer.getResidenceAddress());
            concreteflyweight.setProfile(customer.getProfile());

            concreteflyweight.getCustomer();
        }
    }

    private static Customer getCustomer() {
        //Random get the customer by the locationMap
        return customer;
    }
}
