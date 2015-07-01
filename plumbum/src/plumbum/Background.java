package plumbum;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Background {
	
	static Color backgroundColor = new Color(15,15,70);
	static Color linesColor = Color.cyan;

	public static JPanel background(){
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, Start.w*Start.blockSize, Start.h*Start.blockSize+1);
		panel.setBackground(backgroundColor);
		return panel;		
	}
	
	public static void draw(Graphics g) {
		System.out.println("test 1");
		for(int i = 0;i<Start.h+1;i++){
			g.setColor(linesColor);
			g.drawLine(0, i*Start.blockSize, Start.w*Start.blockSize, i*Start.blockSize);
		}
		for(int i = 0;i<Start.w+1;i++){
			g.setColor(linesColor);
			g.drawLine(i*Start.blockSize, 0, i*Start.blockSize, Start.h*Start.blockSize);
		}
		System.out.println("test 2");
	}

}
