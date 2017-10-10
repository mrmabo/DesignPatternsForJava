package Visitor.eg;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Person> personList = new ArrayList<>();

    public void attach(Person p){
        personList.add(p);
    }

    public void detach(Person p){
        personList.remove(p);
    }

    public void display(Action action){
        for (Person p : personList){
            p.accept(action);
        }
    }
}
