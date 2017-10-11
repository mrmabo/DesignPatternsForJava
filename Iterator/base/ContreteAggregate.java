package Iterator.base;

import java.util.ArrayList;
import java.util.List;

public class ContreteAggregate extends Aggregate {

    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator CreateIterator() {
        return new ContreteIterator(this);
    }

    public int getCount() {
        return items.size();
    }

    public Object getItem(int index){
        return items.get(index);
    }

    public void setItem(int index, Object item){
        items.add(index, item);
    }
}
