package Command.examle1;

public class SaveCommand implements Command {
    private Database db = new Database();
    private Person person;

    public SaveCommand() {
    }

    public SaveCommand(Person person) {
        this.person = person;
    }

    @Override
    public boolean execute() {
        return db.save(person);
    }

    @Override
    public boolean undo() {
        return db.remove(person);
    }
}
