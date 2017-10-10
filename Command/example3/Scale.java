package Command.example3;

public class Scale implements Command {

	private Square square;
	   private int scalenum;
		
		public Scale(String commands){
			scalenum=StringSplit.getValue(commands);
		}
		
	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		return square.scale(scalenum);
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		return square.unscale();
	}

}
