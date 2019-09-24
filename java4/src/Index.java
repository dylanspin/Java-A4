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
	private JTextPane galg;
	private JLabel naam,geraden,letters,enter,enter2,space;
	private JButton reset,stuur;
	
	public static String vak,tekening;
	public String[] ingevult = new String[100];
	public int tell,kansen;	
	
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
		
		galg = new JTextPane();
		galg.setPreferredSize(new Dimension(400,330));
		galg.setFont(new Font("", Font.PLAIN, 30));
		galg.setForeground(Color.WHITE);
		galg.setBackground(new Color(47,45,45));
		
		reset = new JButton("Reset");//reset button voor de game.//moet denkt nog in een andere class.
		reset.setPreferredSize(new Dimension(100,30));
		reset.addActionListener(
				new ButtonCounterActionListener()
		);		
		
		stuur = new JButton("Stuur");//stuurt de letter/geraden woord.//moet denkt nog in een andere class.
		stuur.setPreferredSize(new Dimension(150,30));
		stuur.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tell++;
				ingevult[tell]=letter.getText();
				Replace.gelijk(ingevult,tell);
				letters.setText(Replace.replaceWoord); 
				letter.setText("");
				kansen = Replace.kansen;
				galg.setText(Replace.tekening);
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
		panel.add(galg);
		
	}
	
	public static void main(String[] args) {
	
		Woord woord = new  Woord(); //Woord class.
		replaceLetter Replace = new replaceLetter(); //replaceLetter class.
		
		woord.random();//pakt een random woord uit de classe woord.
		Replace.replace_woord();//maakt van het woord streepjes.
		
		vak = (Replace.replaceWoord);
		
		SwingUtilities.invokeLater(new Runnable() {    	
    		public void run() {
    			new Index().setVisible(true);
    		}	
    	}); 
		
	}
}

