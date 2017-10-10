package Decorator.hm2;

import java.util.ArrayList;
import java.util.List;

public class LinkedListProfiler extends Decorator{

    @Override
    public List getTarget() {
        return new ArrayList();
    }

    @Override
    public void excute() {
        System.out.println("ArrayList test start:");
    }
}
