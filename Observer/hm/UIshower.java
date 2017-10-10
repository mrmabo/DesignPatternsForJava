package Observer.hm;

import java.util.List;

public class UIshower implements Observer {

    private List<Name> names;

    public UIshower(NameData namedata) {
        namedata.attach(this);
    }

    @Override
    public void update(List<Name> names) {
        this.names = names;

    }

    public void display() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i).toString());
        }
    }
}
