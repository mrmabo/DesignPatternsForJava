package Flyweight.hm;

import java.awt.Image;

public class HeavyweightClient {


    public static void main(String[] args) {

        Image locationMap = null;
        Address residenceAddress = new Address("N100 st.", "Fairfield", "Iowa", "52557");
        int customerId = 10001;
        String firstName = "Ma";
        String lastName = "Bo";
        HealthProfile profile = new HealthProfile();

        ConcreteHeavyweight concreteheavyweight = new ConcreteHeavyweight(customerId, firstName, lastName, residenceAddress, profile, locationMap);

        concreteheavyweight.getCustomer();
    }
}
