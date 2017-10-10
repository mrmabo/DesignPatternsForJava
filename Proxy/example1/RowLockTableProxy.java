package Proxy.example1;

public class RowLockTableProxy implements ITable{
    private ITable realTable;
    private IRow[] lockRows;

    public RowLockTableProxy(ITable toLock){
        realTable=toLock;
        lockRows=new Row[toLock.numOfRows()];
        for (int row=0;row<toLock.numOfRows();row++){
//            lockRows[row]=new Row(toLock,row);
        }
    }

    @Override
    public int numOfRows() {
        return realTable.numOfRows();
    }

    @Override
    public IRow getRow(int rowNum) {
        synchronized(lockRows[rowNum]){
            return realTable.getRow(rowNum);
        }
    }

    @Override
    public void addRow(IRow row, int rowNum) {
        synchronized(lockRows[rowNum]){
            realTable.addRow(row, rowNum);
        }
    }

    @Override
    public void modifyRow(int rowNum, IRow row) {
        synchronized(lockRows[rowNum]){
            realTable.modifyRow(rowNum, row);
        }
    }

    @Override
    public void deleteRow(int rowNum) {
        synchronized(lockRows[rowNum]){
            realTable.deleteRow(rowNum);
        }
    }


}
