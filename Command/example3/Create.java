package Command.example3;

public class Create implements Command {
	private Square square;
	
	public Create(String commands){
		square=new Square(StringSplit.getValue(commands));
	}

	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		return square.paint();
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		return square.unpaint();
	}

}
