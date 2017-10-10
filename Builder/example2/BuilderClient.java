package Builder.example2;

public class BuilderClient {
    public static void main(String[] args) {
        RequestDirector rd = new RequestDirector(new CustomerServiceRequestBuilder());

        rd.setPhone("6419546605");
        rd.setAgent(new Agent("1000001", new Address("N1000 ST.", "Fairfield", "IOWA", "52557")));
        rd.setReqContent("How to download the game?");
        rd.setRespContent("Click the www.url.com");
        rd.setAnswered(true);
        rd.setSaleLead(false);
        rd.setSaleLead(false);

        rd.constructRequest();

        Request request = rd.getRequest();
        System.out.println(request);

    }
}
