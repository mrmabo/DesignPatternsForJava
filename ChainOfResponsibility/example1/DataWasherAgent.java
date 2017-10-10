package ChainOfResponsibility.example1;

public class DataWasherAgent extends AbstractAgent {

    public boolean checkRecordByDataWasher(CallRecord record){

        if(record.getAgent().getWorkLocation().getCity() == "fairfeild"  &&
                record.getAgent().getWorkLocation().getZipcode() != "52557"){
            return false;
        }

        return true;

    }

    @Override
    public void checkRecord(CallRecord record) {

        if(!this.checkRecordByDataWasher(record)){
            return;
        } else {
            if(this.nextAgent == null){
                System.out.println("The Reporter : " + record.getCustomer().getFirstName());
            }
        }

    }
}
