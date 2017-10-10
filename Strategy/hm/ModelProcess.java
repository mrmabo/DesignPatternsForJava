package Strategy.hm;

import java.util.List;

public class ModelProcess {
    private Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    public long getRevenue(List<Flight> flights) {
        return model.getRevenue(flights);
    }
}
