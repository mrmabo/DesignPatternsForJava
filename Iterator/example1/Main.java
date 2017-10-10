package Iterator.example1;

import Iterator.example1.Iterator;

public class Main {
    public static void main(String[] args) {
        NameRepository nr = new NameRepository();

//        System.out.println(nr.getNames()[1]);

        Iterator iterator = nr.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
