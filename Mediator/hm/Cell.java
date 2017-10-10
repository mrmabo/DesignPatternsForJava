package Mediator.hm;

public abstract class Cell {
    protected BoardMediator mediator;
    protected int x;
    protected int y;
    protected String color;


    public Cell(BoardMediator mediator, int x, int y) {
        this.mediator = mediator;
        this.x = x;
        this.y = y;
        this.color = null;
    }

    public abstract void changeColor(String color);

    public BoardMediator getMediator() {
        return mediator;
    }

    public void setMediator(BoardMediator mediator) {
        this.mediator = mediator;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
