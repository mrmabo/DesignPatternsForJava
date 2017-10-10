package Command.example3;

import java.awt.Graphics;
import java.util.StringTokenizer;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class CommandMain {
	
	public static void main(String[] args){
		Graphics g=null;
		int secSize=30;
	    Square square=new Square(g,secSize);
	    //Paint a square
		square.paint();	
		//Undo a pain
		square.unpaint();
		
		//move square
		
		String s2="this is a test";  
		String sarray[]=s2.split(" ");  
		int len=sarray.length;
		System.out.println("sarray.length="+sarray.length); 
		System.out.println(sarray[len-1]);
		
	}

}
