package Observer.base;

public class Main {
    public static void main(String[] args) {
        ContreteSubject s = new ContreteSubject();

        s.Attach(new ContreteObserver(s, "john"));
        s.Attach(new ContreteObserver(s, "jobs"));

        s.setSubjectState("leave");
        s.Notify();
    }
}
