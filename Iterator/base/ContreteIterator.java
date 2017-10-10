package Iterator.base;

public class ContreteIterator extends Iterator {

    private Aggregate aggregate;

    public ContreteIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object First() {
        return null;
    }

    @Override
    public Object Next() {
        return null;
    }

    @Override
    public boolean IsDone() {
        return false;
    }

    @Override
    public Object CurrentItem() {
        return null;
    }
}
