package Strategy.base;

public class Context {
    Stragegy stragegy;

    public Context(Stragegy stragegy) {
        this.stragegy = stragegy;
    }

    public void ContextInterface(){
        stragegy.AlgorithmInterface();
    }
}
