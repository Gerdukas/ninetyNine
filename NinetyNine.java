import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class NinetyNine extends JFrame {
	public Deck myDeck = new Deck(1, true);
	public boolean clockwise=true;
	private JButton jbtCard1= new JButton("Card 1");
	private JButton jbtCard2= new JButton("Card 2");
	private JButton jbtCard3= new JButton("Card 3");
	protected PlayingArea canvas= new PlayingArea();
	public int total= canvas.getTotal();
	public NinetyNine(){
		JPanel panel = new JPanel(); // Playing area
		panel.add(jbtCard1);
		panel.add(jbtCard2);
		panel.add(jbtCard3);
		JLabel scoreLabel = new JLabel("Total: 0");
		this.add(panel, BorderLayout.SOUTH);
		this.add(canvas, BorderLayout.CENTER);
		this.add(scoreLabel, BorderLayout.NORTH);
		jbtCard1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				canvas.card1();
				scoreLabel.setText("Total: " + canvas.getTotal());
			}
		});
		jbtCard2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				canvas.card2();	
				scoreLabel.setText("Total: " + canvas.getTotal());
			}
		});
		jbtCard3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				canvas.card3();	
				scoreLabel.setText("Total: " + canvas.getTotal());
			}
		});
	}
	
	public static void main(String[] args){
		JFrame frame= new NinetyNine();
		frame.setTitle("NinetyNine");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setVisible(true);
	}

}
