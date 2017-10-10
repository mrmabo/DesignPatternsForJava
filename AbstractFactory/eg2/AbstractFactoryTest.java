package AbstractFactory.eg2;

import java.util.ArrayList;
import java.util.List;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        Address address = new Address("1000 4th", "st mum", "Fairfield", "IOWA", "52557");
        Order order = new Order("Adults", "Box");
        String customerType = order.getCustomerType();
        String packType = order.getPackType();
        IFactory factory = null;
        if (customerType.equalsIgnoreCase("Business")) {
            if (packType.equalsIgnoreCase("Bag")) {
                factory = new BusinessBagFactory();
            } else if (packType.equalsIgnoreCase("Box")) {
                factory = new BuinessBoxFactory();
            } else if (packType.equalsIgnoreCase("Wrap")) {
                factory = new BusinessWrapFactory();
            }
        } else if (customerType.equalsIgnoreCase("Adults")) {
            if (packType.equalsIgnoreCase("Bag")) {
                factory = new AdultsBagFactory();
            } else if (packType.equalsIgnoreCase("Box")) {
                factory = new AdultsBoxFactory();
            } else if (packType.equalsIgnoreCase("Wrap")) {
                factory = new AdultsWrapFactory();
            }
        } else if (customerType.equalsIgnoreCase("Kids")) {
            if (packType.equalsIgnoreCase("Bag")) {
                factory = new KidsBagFactory();
            } else if (packType.equalsIgnoreCase("Box")) {
                factory = new KidsBoxFactory();
            } else if (packType.equalsIgnoreCase("Wrap")) {
                factory = new KidsWrapFactory();
            }
        }

        Packaging packaging = factory.produce();

        GiftItem giftitem = new GiftItem(packaging, "100", "Iphone 8", "Apple phone", packType);

        List<GiftItem> giftItems = new ArrayList<GiftItem>();
        giftItems.add(giftitem);

        GiftPack giftpack = new GiftPack(giftItems, address, customerType);
        Address addressout = giftpack.getShippingAddress();
        String addressprint = addressout.toString();
        for (int i = 0; i < giftpack.getGiftItems().size(); i++) {
            Packaging packagingout = giftpack.getGiftItems().get(i).getPackaging();
            String giftId = giftpack.getGiftItems().get(i).getGiftId();
            String giftName = giftpack.getGiftItems().get(i).getGiftName();
            String description = giftpack.getGiftItems().get(i).getDescription();
            String packTypeout = packagingout.getPackType();
            float packCostout = packagingout.getCost();

            System.out.println("giftId:" + giftId);
            System.out.println("giftName:" + giftName);
            System.out.println("description:" + description);
            System.out.println("packType:" + packTypeout);
            System.out.println("packagingCost:" + packCostout);

        }
    }
}
