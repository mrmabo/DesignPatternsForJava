package ChainOfResponsibility.example1;


public class ChainBuilder {

    private AbstractAgent handler;

    public void buildChain(){
        AbstractAgent validator = new ValidatorAgent();
        AbstractAgent dataWasher = new DataWasherAgent();
        validator.nextAgent = dataWasher;
        handler = validator;

    }

    public AbstractAgent getHandler() {
        return handler;
    }

}
