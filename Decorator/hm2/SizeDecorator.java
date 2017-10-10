package Decorator.hm2;

import java.util.List;

public class SizeDecorator extends Decorator{
    protected Decorator toBeDecorated;

    public SizeDecorator(Decorator toBeDecorated) {
        this.toBeDecorated = toBeDecorated;
    }

    @Override
    public List getTarget() {
        return this.toBeDecorated.getTarget();
    }

    @Override
    public void excute() {
        this.toBeDecorated.excute();
        this.getTarget().size();
        excuteSize();
    }

    public void excuteSize() {
        System.out.println("SizeDecorator excute test is done");
    }
}
