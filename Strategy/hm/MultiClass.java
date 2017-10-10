package Strategy.hm;

import java.util.List;

public class MultiClass implements Model {

    @Override
    public long getRevenue(List<Flight> flights) {
        long total = 0;
        int passenger = 0;
        for (int i = 0; i < flights.size(); i++) {
            passenger = flights.get(i).getPassenger();
            total += 1.025 * passenger * BASETICKETPRICE - 1.2 * COST;
        }
        return total;
    }

}
