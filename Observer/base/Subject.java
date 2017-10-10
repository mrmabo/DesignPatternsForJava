package Observer.base;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void Attach(Observer observer){
        this.observers.add(observer);
    }

    public void Dettach(Observer observer){
        this.observers.remove(observer);
    }

    public void Notify(){
        for (Observer o : observers){
            o.update();
        }
    }
}
