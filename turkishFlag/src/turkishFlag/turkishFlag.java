package turkishFlag;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class turkishFlag {
	public static void main(String[] args) {
		republic ninetyNine = new republic();
		ninetyNine.setTitle("CUMHURİYET 99 YAŞINDA!!!");
		
		
		ninetyNine.setSize(new Dimension(800, 500));
	
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - ninetyNine.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - ninetyNine.getHeight()) / 2);
	    
		
	    ninetyNine.setLocation(x, y);
	    ninetyNine.setVisible(true);
	    ninetyNine.setResizable(false);
	    ninetyNine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}



