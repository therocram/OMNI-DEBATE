package window;
import javax.swing.*;
import java.awt.*;

public class WindowMain 
{

	public static void main(String[] args) 
	{
		JFrame win = new JFrame();
		
		win.setTitle("Omni-Debate");
		win.setLayout(new GridLayout(2,1));
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setBounds(500, 150, 800, 600);
		Container pane = win.getContentPane();
		win.setVisible(true);
	}

}
