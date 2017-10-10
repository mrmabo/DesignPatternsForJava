package Memento.example;

public class Memento {

    private User user;

    public Memento(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
