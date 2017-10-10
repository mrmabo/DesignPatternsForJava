package Strategy.hm;

import java.util.List;

public interface Model {
    public int BASETICKETPRICE = 300;
    public int COST = 50000;

    public long getRevenue(List<Flight> flights);
}
