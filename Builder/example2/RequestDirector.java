package Builder.example2;

public class RequestDirector {
    private RequestBuilder requestBuilder = null;

    private String phone;
    private Agent agent;
    private String reqContent;
    private String respContent;
    private boolean isAnswered;
    private boolean isSaleLead;
    private boolean needCallBack;

    public RequestDirector(RequestBuilder requestBuilder) {
        this.requestBuilder = requestBuilder;
    }

    public void constructRequest() {
        requestBuilder.buildRequest(agent);
        requestBuilder.buildCustomer(phone);
        requestBuilder.buildReq(reqContent);
        requestBuilder.buildRes(respContent);
        requestBuilder.buildConsultation(isSaleLead);
        requestBuilder.buildCloseRequest(isAnswered, needCallBack);
    }

    public Request getRequest() {
        return requestBuilder.getRequest();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getReqContent() {
        return reqContent;
    }

    public void setReqContent(String reqContent) {
        this.reqContent = reqContent;
    }

    public String getRespContent() {
        return respContent;
    }

    public void setRespContent(String respContent) {
        this.respContent = respContent;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setAnswered(boolean isAnswered) {
        this.isAnswered = isAnswered;
    }

    public boolean isSaleLead() {
        return isSaleLead;
    }

    public void setSaleLead(boolean isSaleLead) {
        this.isSaleLead = isSaleLead;
    }

    public boolean isNeedCallBack() {
        return needCallBack;
    }

    public void setNeedCallBack(boolean needCallBack) {
        this.needCallBack = needCallBack;
    }


}
