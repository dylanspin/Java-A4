import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonCounterActionListener implements ActionListener {

	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Restart!");
		
		Index index = new  Index(); //Woord class.
		
		index.main(new String[0]);//restard de Jframe
	}

}
