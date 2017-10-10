package Iterator.example1;

public class NameRepository implements Aggregate {
    private String names[] = {"Rob", "Jon", "Jul", "Lor", "Pat", "Ken"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    public String[] getNames() {
        return names;
    }

    public class NameIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                System.out.println("index : " + index);
                return names[index++];
            }
            return null;
        }
    }
}
