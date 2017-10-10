package Iterator.base;

import java.util.ArrayList;
import java.util.List;

public class ContreteAggregate extends Aggregate {

    private List<Object> items = new ArrayList<>();

    private int count;
    private Object o;


    @Override
    public Iterator CreateIterator() {
        return new ContreteIterator(this);
    }


}
