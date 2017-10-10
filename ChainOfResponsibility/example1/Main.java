package ChainOfResponsibility.example1;

public class Main {

    public static CallRecord[] makeData(){

        Address addresses[] = {
                new Address("1000 N 4th ST", "fairfeild", "IA", "52557"),
                new Address("1001 N 4th ST", "new york", "IA", "52557"),
                new Address("1002 N 4th ST", "fairfeild", "IA", "52556"),
                new Address("1003 N 4th ST", "fairfeild", "IA", "52557"),
                new Address("1004 N 4th ST", "fairfeild", "IA", "52557")
        };

        Customer customer[] = {
                new Customer("Bo0","Ma", addresses[0], "6419546605", "mrmabo.cn@gmail.com"),
                new Customer("Bo1","Ma", addresses[1], "6419546605", "mrmabo.cn@gmail.com"),
                new Customer("Bo2","Ma", addresses[2], "6419546605", "mrmabo.cn@gmail.com"),
                new Customer("Bo3","Ma", addresses[3], "6419546605", "mrmabo.cn@gmail.com"),
                new Customer("Bo4","Ma", null, "6419546605", "mrmabo.cn@gmail.com"),
                new Customer("Bo5","Ma", addresses[3], "", "mrmabo.cn@gmail.com"),
                new Customer("Bo6","Ma", addresses[3], "6419546605", ""),
        };

        Agent agent[] = {
                new Agent("0", addresses[0]),
                new Agent("1", addresses[1]),
                new Agent("2", addresses[2]),
                new Agent("3", addresses[3]),
                new Agent("4", addresses[4]),

        };

        CallRecord callRecord[] = {
                new CallRecord(customer[0], agent[0]),
                new CallRecord(customer[1], agent[1]),
                new CallRecord(customer[2], agent[2]),
                new CallRecord(customer[3], agent[3]),
                new CallRecord(customer[4], agent[4]),
                new CallRecord(customer[5], agent[4]),
                new CallRecord(customer[6], agent[4]),
        };

        return callRecord;

    }

    public static void main(String[] args) {

        Chain c = new Chain();

        CallRecord[] callRecordList = makeData();

        for (int i = 0; i < callRecordList.length; i++) {
            c.sendRequest(callRecordList[i]);
        }

    }
}
