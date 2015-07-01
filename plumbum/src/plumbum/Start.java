package plumbum;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Start extends JPanel implements Runnable{

	public static int blockSize = 32;
	public static int w = 30;//width in block
	public static int h = 20;//height in block
		
	private BufferedImage img;
	private static Graphics gr;
	
	private Thread thread1 = new Thread(this);
	
	public Start(){
		thread1.start();
	}
	public void updatePaint(){
		Background.draw(gr);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("PETOOH");
		frame.setSize(w*blockSize+200+6, h*blockSize+29);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		gr = frame.getGraphics();
		frame.add(Background.background());
		
		frame.add(SidePanel.sidePanel());
		
		frame.add(new Start());
	}

	public void run() {
		int c = 0;
		while(true){
			
			updatePaint();
			System.out.println(c);
			try {
				thread1.sleep(100);
			} catch (InterruptedException e) {e.printStackTrace();}
			c++;
		}
		
	}

}
