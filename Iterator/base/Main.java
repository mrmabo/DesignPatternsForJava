package Iterator.base;

public class Main {
    public static void main(String[] args) {
        ContreteAggregate a = new ContreteAggregate();

        a.setItem(0, "first");
        a.setItem(1, "second");
        a.setItem(2, "three");
        a.setItem(3, "four");
        a.setItem(4, "five");
        a.setItem(5, "six");

        Iterator i = new ContreteIterator(a);
        Object item = i.First();
        while (!i.IsDone()){
            System.out.println("item : " + i.CurrentItem());
            i.Next();
        }


    }
}
