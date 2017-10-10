package Builder.example2;

public interface RequestBuilder {
    public void buildRequest(Agent agent);

    public void buildCustomer(String phone);

    public void buildReq(String reqContent);

    public void buildRes(String resContent);

    public void buildConsultation(boolean isSaleLead);

    public void buildCloseRequest(boolean isAnswered, boolean needCallBack);

    public Request getRequest();
}
