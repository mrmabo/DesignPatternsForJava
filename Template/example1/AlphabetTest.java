package Template.example1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AlphabetTest {

    public static void main(String[] args) {

        File f = new File(System.getProperty("user.dir") + "/src/Template/example1/doc/");
        File[] files = f.listFiles();
        String encoding = "UTF-8";
        for (File file : files) {
            List<String> list = new ArrayList<String>();
            try {
                if (file.isFile() && file.exists()) {
                    InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
                    BufferedReader bufferedReader = new BufferedReader(read);
                    String lineText = null;
                    while ((lineText = bufferedReader.readLine()) != null) {
                        list.add(lineText);
                    }
                    AlphabetTemplate template = new implementAlphabet();
                    template.processAlphabet(list);
                    System.out.println("");
                    bufferedReader.close();
                    read.close();
                } else {
                    System.out.println("Not found the file.");
                }
            } catch (Exception e) {
                System.out.println("Error to read file.");
                e.printStackTrace();
            }
        }
    }
}
