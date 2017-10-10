package Command.example3;

public class Move implements Command {
   private Square square;
   private int movenum;
	
	public Move(String commands){
		movenum=StringSplit.getValue(commands);
	}
	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		return square.move(movenum);
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		return square.unmove();
	}

}
