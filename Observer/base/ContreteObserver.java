package Observer.base;

public class ContreteObserver extends Observer {

    private ContreteSubject contreteSubject;
    private String observerState;
    private String name;

    public ContreteObserver(ContreteSubject contreteSubject, String name) {
        this.contreteSubject = contreteSubject;
        this.name = name;
    }

    public ContreteSubject getContreteSubject() {
        return contreteSubject;
    }

    public void setContreteSubject(ContreteSubject contreteSubject) {
        this.contreteSubject = contreteSubject;
    }

    @Override
    public void update() {
        observerState = contreteSubject.getSubjectState();
        System.out.println("observer-" +this.name+ " state:" + observerState);
    }
}
