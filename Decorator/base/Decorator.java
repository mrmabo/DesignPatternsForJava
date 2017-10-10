package Decorator.base;

public class Decorator extends Compenent {
    private Compenent compenent;

    public void setCompenent(Compenent compenent) {
        this.compenent = compenent;
    }

    @Override
    public void Operation() {
        if(this.compenent != null){
            this.compenent.Operation();
        }
    }
}
