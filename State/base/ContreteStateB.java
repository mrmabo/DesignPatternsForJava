package State.base;

public class ContreteStateB extends State {

    @Override
    public void Handle(Context context) {
        context.setState(new ContreteStateB());
    }
}
