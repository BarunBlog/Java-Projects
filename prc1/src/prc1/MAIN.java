package prc1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Test");
		frame.setSize(600,500);
		frame.setLayout(null);
		
		JButton bt1 = new JButton("Show");
		bt1.setBounds(100,20,70,20);
		frame.add(bt1);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(120, 150, 120, 20);
		frame.add(tf1);
		
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				String str1 = tf1.getText();
				System.out.println(str1);
				
			}
		});
		
		
		frame.setVisible(true);
		
	}

}
