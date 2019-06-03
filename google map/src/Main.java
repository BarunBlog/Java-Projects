import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Browser browser = BrowserFactory.create();
	        JFrame frame = new JFrame("JxBrowser Google Maps");
	        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        frame.add(browser.getView().getComponent(), BorderLayout.CENTER);
	        frame.setSize(700, 500);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	        browser.loadURL("http://maps.google.com");
	}

}
