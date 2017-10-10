package Strategy.hm;

import java.util.ArrayList;
import java.util.List;

public class ModelTest {
    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<Flight>();
        flights.add(new Flight(200));
        flights.add(new Flight(210));
        flights.add(new Flight(250));

        Model model1 = new SinglePrice();
        Model model2 = new TwoClasses();
        Model model3 = new MultiClass();

        ModelProcess modelprocess = new ModelProcess();
        modelprocess.setModel(model1);
        System.out.println("Single strategy revenue:" + modelprocess.getRevenue(flights));

        modelprocess.setModel(model2);
        System.out.println("TwoClass strategy revenue:" + modelprocess.getRevenue(flights));

        modelprocess.setModel(model3);
        System.out.println("MultiClass strategy revenue:" + modelprocess.getRevenue(flights));

    }
}
