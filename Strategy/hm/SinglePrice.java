package Strategy.hm;

import java.util.List;

public class SinglePrice implements Model {

    @Override
    public long getRevenue(List<Flight> flights) {
        long total = 0;
        int passenger = 0;
        for (int i = 0; i < flights.size(); i++) {
            passenger = flights.get(i).getPassenger();
            total += passenger * BASETICKETPRICE - COST;
        }
        return total;
    }

}
