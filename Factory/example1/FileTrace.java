package Factory.example1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileTrace implements Trace {

    private boolean debug;

    private static final String FILENAME = System.getProperty("user.dir") + "/src/Factory/example1/trace.log";

    @Override
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    @Override
    public void debug(String message) {
        if(debug){
            this.writeFile("debug message : " + message);
        }
    }

    @Override
    public void error(String message) {
        if(debug){
            this.writeFile("error message : " + message);
        }
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
}
