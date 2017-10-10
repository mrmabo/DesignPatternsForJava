package Decorator.hm2;

import java.util.List;


public class RemoveDecorator extends Decorator{
    protected Decorator toBeDecorated;

    public RemoveDecorator(Decorator toBeDecorated) {
        this.toBeDecorated = toBeDecorated;
    }

    @Override
    public List getTarget() {
        return this.toBeDecorated.getTarget();
    }

    @Override
    public void excute() {
        this.toBeDecorated.excute();
        this.getTarget().remove(0);
        excuteRemove();
    }

    public void excuteRemove() {
        System.out.println("RemoveDecorator excute test is done");
    }
}
