package Proxy.example1;

public abstract class Row implements IRow {
    private IRow row;
    public Row(ITable table,int rowNum){
        row=table.getRow(rowNum);
    }

}
