package Observer.hm;

public interface Subject {
    public void attach(Observer observer);

    public void detach(Observer observer);

    public void notifyObserver();

}
