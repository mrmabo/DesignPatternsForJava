package Mediator.hm;

public class CellImpl extends Cell {

    public CellImpl(BoardMediator mediator, int x, int y) {
        super(mediator, x, y);
    }

    @Override
    public void changeColor(String color) {
        this.setColor(color);
    }
}
