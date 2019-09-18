import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class Index extends JFrame{
	
	private JTextField letter,raden;
	private JLabel naam,geraden,letters,enter,enter2,space;
	private JButton reset,stuur;
	
	public static String vak;
	public String[] ingevult = new String[100];
	public int tell;	
	
	public Index() {
		
		createView();
		
		setTitle("Hangman");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,700);
		setLocationRelativeTo(null);
		setResizable(false);
		
	}
	
	public void createView() {
		
		replaceLetter Replace = new replaceLetter();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(47,45,45));
		getContentPane().add(panel);
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		raden = new JTextField("Woord");//textfield voor het raden van het woord.
		raden.setPreferredSize(new Dimension(150,30));
		raden.addFocusListener(new FocusListener() {//placeholder ding.
			
		    public void focusGained(FocusEvent e) {
		        if (raden.getText().equals("Woord")) {
		        	raden.setText("");
		        	raden.setForeground(Color.BLACK);
		        }
		    }
		    public void focusLost(FocusEvent e) {
		        if (raden.getText().isEmpty()) {
		        	raden.setForeground(Color.GRAY);
		        	raden.setText("Woord");
		        }
		    }
	    });
		
		letter = new JTextField("");//krijg for some reason niet de input moet gefixt worden
		letter.setPreferredSize(new Dimension(100,30));
		letter.addFocusListener(new FocusListener() {//placeholder ding.
			
		    public void focusGained(FocusEvent e) {
		        if (letter.getText().equals("Letter")) {
		        	letter.setText("");
		        	letter.setForeground(Color.BLACK);
		        }
		    }
		    public void focusLost(FocusEvent e) {
		        if (letter.getText().isEmpty()) {
		        	letter.setForeground(Color.GRAY);
		        	letter.setText("Letter");
		        }
		    }
	    });
		
		enter = new JLabel();
		enter.setPreferredSize(new Dimension(400,20));
		
		enter2 = new JLabel();
		enter2.setPreferredSize(new Dimension(300,20));

		space = new JLabel();
		space.setPreferredSize(new Dimension(70,30));
		
		naam = new JLabel("Hangman ");//naam game.
		naam.setForeground(Color.WHITE);
		naam.setFont(new Font("", Font.PLAIN, 75));
		
		letters = new JLabel(vak);
		letters.setForeground(Color.WHITE);
		letters.setFont(new Font("", Font.PLAIN, 40));
		letters.setPreferredSize(new Dimension(290,40));
		
		geraden = new JLabel("");
		geraden.setFont(new Font("", Font.PLAIN, 75));
		geraden.setPreferredSize(new Dimension(400,50));
		geraden.setBackground(Color.BLUE);
		
		reset = new JButton("Reset");//reset button voor de game.
		reset.setPreferredSize(new Dimension(100,30));
		reset.addActionListener(
				new ButtonCounterActionListener()
		);		
		
		stuur = new JButton("Stuur");//stuurt de letter/geraden woord.
		stuur.setPreferredSize(new Dimension(150,30));
		stuur.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tell++;
				ingevult[tell]=letter.getText();
				Replace.gelijk(ingevult,tell);
				//letters.setText(Replace.replaceWoord); moet nog 
			}	
		});
		
		panel.add(naam);
		panel.add(enter);
		panel.add(letter);
		panel.add(raden);
		panel.add(enter2);
		panel.add(space);
		panel.add(letters);
		panel.add(stuur);
		panel.add(reset);
		panel.add(geraden);
		
	}
		/*Dit moet in een andere classe. Het moet eerst het woord van de classe woord halen dan moet die naar streepjes omzetten.
		  Als die dat heeft gedaan stuurt die hem naar de main class. Wat dan weer hier word uitgeprint op de locatie. later als
		  er een letter word door gestuurd dan moet die checken als de letter in het woord zit zo ja veranderd die het weer en stuurt
		  het weer door en word het weer uitgeprint en als het niet klopt moet die dat door geven aand de class die de levens doet 
		  ook nog moet er score bij gehouden*/
	
	public static void main(String[] args) {
	
		Woord woord = new  Woord(); //Woord class.
		replaceLetter Replace = new replaceLetter(); //replaceLetter class.
		
		woord.random();//pakt een random woord uit de classe woord.
		Replace.replace_woord();//maakt van het woord streepjes.
		
		vak = (Replace.replaceWoord);
		
		Index Class = new Index();
		
		SwingUtilities.invokeLater(new Runnable() {    	
    		public void run() {
    			new Index().setVisible(true);
    		}	
    	}); 
		
	}
}

