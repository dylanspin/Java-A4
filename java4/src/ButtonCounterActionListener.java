import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ButtonCounterActionListener implements ActionListener {


	public void actionPerformed(ActionEvent e) {
		
		main mainClass = new  main(); //Woord class.
		
		mainClass.main(new String[0]);//restard de Jframe
	}



}
