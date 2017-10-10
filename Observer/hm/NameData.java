package Observer.hm;

import java.util.ArrayList;
import java.util.List;

public class NameData implements Subject {

    private List<Name> names;
    private List<Observer> observers;
    private final Object MUTEX = new Object();

    public NameData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void attach(Observer observer) {
        synchronized (MUTEX) {
            if (!observers.contains(observer)) {
                observers.add(observer);
            }
        }

    }

    @Override
    public void detach(Observer observer) {
        synchronized (MUTEX) {
            int i = observers.indexOf(observer);
            if (i >= 0)
                observers.remove(i);
        }

    }

    @Override
    public void notifyObserver() {
        synchronized (MUTEX) {
            int n = observers.size();
            for (int i = 0; i < n; i++) {
                Observer observer = (Observer) observers.get(i);
                observer.update(names);
            }
        }
    }

    public void sendNameData() {
        notifyObserver();
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public void setNameData(List<Name> names) {
        this.names = names;
        sendNameData();
    }

}
