import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;

public class Test extends JFrame{
	
	
	public void Test() {
		
		createView();
		
		setTitle("Hangman");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		setLocationRelativeTo(null);
		setResizable(false);
		
	}
	
	private void createView() {
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		getContentPane().add(panel);
		
	}
	
	public void print() {
		Test Class = new Test();
		
		SwingUtilities.invokeLater(new Runnable() {
	  		    	
    		public void run() {
    			new Test().setVisible(true);
    		}
    	});    
	}
}
