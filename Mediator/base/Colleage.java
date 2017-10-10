package Mediator.base;

public abstract class Colleage {
    protected Mediator mediator;

    public Colleage(Mediator mediator) {
        this.mediator = mediator;
    }
}
