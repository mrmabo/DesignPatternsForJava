package State.base;

public class ContreteStateA extends State {

    @Override
    public void Handle(Context context) {
        context.setState(new ContreteStateA());
    }
}
