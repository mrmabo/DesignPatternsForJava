package ChainOfResponsibility.example;

public class ChainBuilder {
    private AbstractAgent handler;
    //other necessary code here
    
    

    private void buildChain(){
        AbstractAgent junior = new JuniorAgent();
        AbstractAgent senior = new SeniorAgent();
        AbstractAgent supervisor = new AgentSupervisor();
        junior.nextAgent = senior;
        senior.nextAgent = supervisor;
        handler = junior;
    }

    public AbstractAgent getHandler() {
        return handler;
    }
}
