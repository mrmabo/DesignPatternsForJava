package Iterator.example2;

public class NameRepository implements Aggregate {

    private String names[][] = {
            {"Rob1", "Jon1", "Jul1", "Lor1", "Pat1", "Ken1"},
            {"Rob2", "Jon2", "-", "Lor2", "Pat2", "Ken2"},
            {"Rob3", "Jon3", "Jul3", "Lor3", "-", "Ken3"}
    };

    private int rownum = names.length;
    private int lastrowcolnum = names[rownum - 1].length;

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    public String[][] getNames() {
        return names;
    }

    public class NameIterator implements Iterator {

        int row = 0;
        int col = 0;

        @Override
        public boolean hasNext() {
            if ((row < (rownum - 1)) || (row == (rownum - 1) && col < lastrowcolnum)) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            String result = "";

            if (this.hasNext()) {
                if (col < names[row].length) {
                    result = names[row][col];
                } else if (row < names.length) {
                    col = 0;
                    row++;
                    result = names[row][col];
                }
                if (result.equals("-")) {
                    if (col < names[row].length) {
                        col++;
                    } else {
                        col = 0;
                        row++;
                    }
                    result = names[row][col];
                    return result;
                } else {
                    if (col < names[row].length) {
                        col++;
                    } else {
                        col = 0;
                        row++;
                    }
                    return result;
                }
            }
            return null;
        }
    }
}
