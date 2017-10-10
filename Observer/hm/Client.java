package Observer.hm;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Name name1 = new Name("firstname1", "lastname1");
        Name name2 = new Name("firstname2", "lastname2");
        Name name3 = new Name("firstname3", "lastname3");

        List<Name> names = new ArrayList<Name>();
        names.add(name1);
        names.add(name2);
        NameData namedata = new NameData();
        namedata.setNameData(names);
        UIshower uishower = new UIshower(namedata);
        uishower.update(names);
        uishower.display();

        names.remove(name2);
        System.out.println("Update names and notify UI:");
        uishower.update(names);
        uishower.display();
    }
}
