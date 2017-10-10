package Mediator.hm;

import java.util.ArrayList;
import java.util.List;

public class BoardMediatorImp implements BoardMediator {
    private List<Cell> cells;

    public BoardMediatorImp() {
        this.cells = new ArrayList<Cell>();
    }

    @Override
    public void changeCellColor(String color, Cell cell) {
        BoardMediator mediator = cell.getMediator();
        int xx = cell.x;
        int yy = cell.y;

        while (yy < 8) {
            yy = yy + 1;
            Cell cellnew = new CellImpl(mediator, xx, yy);
            if (cellnew.getColor() == null) {
                cellnew.setColor(color);
            }
        }
        while (xx > 0) {
            xx = xx - 1;
            Cell cellnew = new CellImpl(mediator, xx, yy);
            if (cellnew.getColor() == null) {
                cellnew.setColor(color);
            }
        }
        while (xx < 8) {
            xx = xx + 1;
            Cell cellnew = new CellImpl(mediator, xx, yy);
            if (cellnew.getColor() == null) {
                cellnew.setColor(color);
            }
        }
        while (yy > 0) {
            yy = yy - 1;
            Cell cellnew = new CellImpl(mediator, xx, yy);
            if (cellnew.getColor() == null) {
                cellnew.setColor(color);
            }
        }

        while ((xx + 1) < 8 && (yy + 1) < 8) {
            xx = xx + 1;
            yy = yy + 1;
            Cell cellnew = new CellImpl(mediator, xx, yy);
            if (cellnew.getColor() == null) {
                cellnew.setColor(color);
            }
        }
        while ((xx - 1) > 0 && (yy - 1) > 0) {
            xx = xx - 1;
            yy = yy - 1;
            Cell cellnew = new CellImpl(mediator, xx, yy);
            if (cellnew.getColor() == null) {
                cellnew.setColor(color);
            }
        }
        while ((xx - 1) > 0 && (yy + 1) < 8) {
            xx = xx - 1;
            yy = yy + 1;
            Cell cellnew = new CellImpl(mediator, xx, yy);
            if (cellnew.getColor() == null) {
                cellnew.setColor(color);
            }
        }
        while ((xx + 1) < 8 && (yy - 1) > 0) {
            xx = xx + 1;
            yy = yy - 1;
            Cell cellnew = new CellImpl(mediator, xx, yy);
            if (cellnew.getColor() == null) {
                cellnew.setColor(color);
            }
        }
    }

    @Override
    public void addCell(Cell cell) {
        this.cells.add(cell);
    }

}
