package Memento.example;

public class Originator {
    private User externalizedUser;

    public User getExternalizedUser() {
        return externalizedUser;
    }

    public void setExternalizedUser(User externalizedUser) {
        this.externalizedUser = externalizedUser;
    }

    public Memento saveUserToMemento() {
        return new Memento(externalizedUser);
    }

    public void getUserFromMemento(Memento memento) {
        externalizedUser = memento.getUser();
    }

}
