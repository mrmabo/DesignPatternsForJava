package Builder.example2;

public class CustomerServiceRequestBuilder implements RequestBuilder {

	private Request request=new Request();
	
	@Override
	public void buildRequest(Agent agent) {
		Call call=new Call();
		call.callPop(agent);
		request.setReqId(call.getRequestId());
		request.setAgent(agent);
	}

	@Override
	public void buildCustomer(String phone) {
		Customer c=new Customer(phone);
		request.setRequester(c);
	}

	@Override
	public void buildReq(String reqContent) {
		request.setReqContent(reqContent);
	}

	@Override
	public void buildRes(String resContent) {
		request.setRespContent(resContent);
	}

	@Override
	public void buildConsultation(boolean isSaleLead) {
		request.setSaleLead(isSaleLead);
		if (isSaleLead){
			//forward to supervisor or even a third-party 
		}
	}

	@Override
	public void buildCloseRequest(boolean isAnswered,boolean needCallBack) {
		request.setAnswered(isAnswered);
		request.setNeedCallBack(needCallBack);
		if (isAnswered){
			//close the request
		}else if (needCallBack){
			//Call back to customer
		}
		//Save the request information to database
	}

	@Override
	public Request getRequest() {
		return this.request;
	}

}
