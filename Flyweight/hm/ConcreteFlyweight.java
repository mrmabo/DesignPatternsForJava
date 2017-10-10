package Flyweight.hm;

import java.awt.Image;

public class ConcreteFlyweight implements Flyweight {

    private int customerId;
    private String firstName;
    private String lastName;
    private Address residenceAddress;
    private HealthProfile profile;
    private Image locationMap;


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getResidenceAddress() {
        return residenceAddress;
    }

    public void setResidenceAddress(Address residenceAddress) {
        this.residenceAddress = residenceAddress;
    }

    public HealthProfile getProfile() {
        return profile;
    }

    public void setProfile(HealthProfile profile) {
        this.profile = profile;
    }

    public ConcreteFlyweight(Image locationMap) {
        this.locationMap = locationMap;
    }

    @Override
    public Customer getCustomer() {
        return new Customer(customerId, firstName, lastName, residenceAddress, profile);
    }


}
