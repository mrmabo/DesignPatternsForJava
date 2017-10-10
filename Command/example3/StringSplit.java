package Command.example3;

public class StringSplit {

	public static int getValue(String str){
		String sarray[]=str.split(" ");  
		int len=sarray.length;
		return Integer.parseInt(sarray[len-1]);
	}
}
