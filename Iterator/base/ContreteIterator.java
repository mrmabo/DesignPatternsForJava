package Iterator.base;

public class ContreteIterator extends Iterator {

    private ContreteAggregate aggregate;
    private int current = 0;

    public ContreteIterator(ContreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object First() {
        return aggregate.getItem(0);
    }

    @Override
    public Object Next() {
        Object ret = null;
        current++;
        if(current<aggregate.getCount()){
            ret = aggregate.getItem(current);
        }
        return ret;
    }

    @Override
    public boolean IsDone() {
        return current >= aggregate.getCount() ? true : false;
    }

    @Override
    public Object CurrentItem() {
        System.out.println(current);
        return aggregate.getItem(current);
    }
}
