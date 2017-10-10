package Composite.example;

import java.util.ArrayList;
import java.util.Collection;

public class Composite extends Component {

    public Composite(String title) {
        super(title);
    }

    @Override
    public void print() {
        System.out.println( "Composite name=" + title );
        for (Component item : super.getList()){
            item.print();
        }
    }
}
