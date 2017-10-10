package Memento.example;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    void add(Memento user) {
        mementoList.add(user);
    }

    Memento getMemento(int index) {
        return mementoList.get(index);
    }

}
