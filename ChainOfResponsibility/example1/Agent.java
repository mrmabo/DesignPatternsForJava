package ChainOfResponsibility.example1;

public class Agent {
    private String agentId;
    private Address workLocation;

    public Agent(String agentId, Address workLocation) {
        this.agentId = agentId;
        this.workLocation = workLocation;
    }

    public String getAgentId() {
        return agentId;
    }

    public Address getWorkLocation() {
        return workLocation;
    }
}
