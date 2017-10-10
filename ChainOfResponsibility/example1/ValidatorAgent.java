package ChainOfResponsibility.example1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ValidatorAgent extends AbstractAgent {

    private static final String FILENAME = System.getProperty("user.dir") + "/src/ChainOfResponsibility/example1/discarded-requests.txt";

    private boolean checkRecordByValidator(CallRecord record){

        if(record.getCustomer().getAddress() == null) {
            record.setRequestInformation(" lack address");
            return false;
        }
        if(record.getCustomer().getPhone().isEmpty()){
            record.setRequestInformation(" lack phone");
            return false;
        }

        if(record.getCustomer().getEmail().isEmpty()){
            record.setRequestInformation(" lack email");
            return false;
        }
        return true;
    }

    private void writeFile(String message) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter(FILENAME, true);
            bw = new BufferedWriter(fw);
            bw.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void checkRecord(CallRecord record) {
        if(!this.checkRecordByValidator(record)){

            this.writeFile(record.getCustomer().getFirstName() + record.getRequestInformation());
            return;

        } else {
            if(this.nextAgent != null){
                this.nextAgent.checkRecord(record);
            }
        }
    }
}
