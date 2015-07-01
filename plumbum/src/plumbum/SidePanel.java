package plumbum;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SidePanel {
	
	static Color backgroundColor = Color.black;
	
	public static JPanel sidePanel(){
		JPanel panel = new JPanel();
		panel.setBounds(Start.w*Start.blockSize, 0, 200, Start.h*Start.blockSize+1);
		panel.setBackground(backgroundColor);
		//panel.add(new JTextField(10));
		return panel;
	}
}
