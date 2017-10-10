package Flyweight.hm;

import java.awt.Image;
import java.util.HashMap;

public class FlyweightFactory {
    private static final HashMap<Image, Flyweight> customerMap = new HashMap();

    public static Flyweight getCustomer(Image locationMap) {
        ConcreteFlyweight concreteflyweight = (ConcreteFlyweight) customerMap.get(locationMap);
        if (concreteflyweight == null) {
            concreteflyweight = new ConcreteFlyweight(locationMap);
            customerMap.put(locationMap, concreteflyweight);
        }
        return concreteflyweight;
    }

}
