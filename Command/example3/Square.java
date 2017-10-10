package Command.example3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Square extends JFrame{
	private static final long serialVersionUID = 1L;
	private Graphics g=null;
	int secSize;
	
	public Square(int secSize){
		this.secSize=secSize;
	}
	
	public Square(Graphics g,int secSize){
		this.g=g;
		this.secSize=secSize;
	}
	
	public void Square(){
		setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}
	
	 public boolean paint() {
		 try{
	        g.setColor(Color.black);
	        g.drawRect(80, 80, this.secSize, this.secSize);
	        return true;
		 }catch(Exception e){
			 e.printStackTrace();
			 return false;
		 }
	    }
	
	 public boolean unpaint() {
		 try{
	        g.setColor(Color.black);
	        g.drawRect(80, 80, 0, 0);
	        return true;
		 }catch(Exception e){
			 e.printStackTrace();
			 return false;
		 }
	    }
	 
	public boolean move(int movenum){
		try{
		g.setColor(Color.black);
        g.drawRect(80+movenum, 80, this.secSize, this.secSize);
        return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean unmove(){
		try{
		g.setColor(Color.black);
        g.drawRect(80, 80, this.secSize, this.secSize);
        return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean scale(int scalenum){
		try{
		g.setColor(Color.black);
        g.drawRect(80, 80, this.secSize*scalenum, this.secSize*scalenum);
        return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean unscale(){
		try{
		g.setColor(Color.black);
        g.drawRect(80, 80, this.secSize, this.secSize);
        return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public int getSecSize() {
		return secSize;
	}

	public void setSecSize(int secSize) {
		this.secSize = secSize;
	}
	

}
