package ChainOfResponsibility.example1;

public class CallRecord {
    private Customer customer;
    private Agent agent;
    private String requestInformation;
//    private boolean isValid;
//    private boolean isASalesLead;


    public CallRecord(Customer customer, Agent agent) {
        this.customer = customer;
        this.agent = agent;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Agent getAgent() {
        return agent;
    }

    public String getRequestInformation() {
        return requestInformation;
    }

    public void setRequestInformation(String requestInformation) {
        this.requestInformation = requestInformation;
    }
}
