package Decorator.hm2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProfiler extends Decorator{

    @Override
    public List getTarget() {
        return new ArrayList();
    }

    @Override
    public void excute() {
        System.out.println("ArrayList test start:");
    }
}
