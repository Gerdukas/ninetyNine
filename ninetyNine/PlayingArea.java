import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PlayingArea extends JPanel{
	public int total=0;

	public void card1() {
		total=total+2;
		refresh();
	}

	

	public void card2() {
		
		refresh();
	}

	public void card3() {
		
		refresh();
	}
	protected void paintComponent(Graphics g){
	}
	private void refresh() {
		
		
	}
	public int getTotal(){
		return total;
	}
	public void addTotal(int total2) {
		total=total2+total;
	}
}
