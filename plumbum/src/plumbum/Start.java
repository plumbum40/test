package plumbum;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Start extends JPanel implements ActionListener{

	public static int blockSize = 32;
	public static int w = 30;//width
	public static int h = 20;//height
	
	Timer t = new Timer(1000/10, this);
	
	public Start(){
		t.start();
	}
	public void paint(Graphics g){
		Background.draw(g);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("PETOOH");
		frame.setSize(w*blockSize+200+6, h*blockSize+29);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		frame.add(Background.background());
		
		frame.add(SidePanel.sidePanel());
		
		frame.add(new Start());
	}

	public void actionPerformed(ActionEvent arg0) {
		repaint();
	}

}
