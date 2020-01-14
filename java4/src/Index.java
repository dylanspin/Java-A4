import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class Index extends JFrame{
	
	private JTextField letter,raden;
	private JTextPane galg;
	private JLabel naam,letters,enter,enter2;
	private JButton reset,stuur;

	public static String vak,tekening;
	public String raad;
	public String[] ingevult = new String[100];
	public int tell,kansen;
	
	public Index() {
		
		createView();
		setTitle("Hangman");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,700);
		setLocation(0,0);
		setLocationRelativeTo(null);
		setResizable(false);	
		
	}
	
	public void createView() {
		
		replaceLetter Replace = new replaceLetter();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(47,45,45));
		getContentPane().add(panel);
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		raden = new JTextField("");
		raden.setPreferredSize(new Dimension(150,30));
		
		letter = new JTextField("");
		letter.setPreferredSize(new Dimension(150,30));
		
		enter = new JLabel("Letter          Woord",SwingConstants.CENTER);
		enter.setPreferredSize(new Dimension(400,20));
		enter.setFont(new Font("", Font.PLAIN, 20));
		enter.setForeground(Color.WHITE);
		
		enter2 = new JLabel();
		enter2.setPreferredSize(new Dimension(300,20));

		naam = new JLabel("Hangman ");//naam game.
		naam.setForeground(Color.WHITE);
		naam.setFont(new Font("", Font.PLAIN, 75));
		
		letters = new JLabel(vak);
		letters.setForeground(Color.WHITE);
		letters.setFont(new Font("", Font.PLAIN, 40));
		letters.setPreferredSize(new Dimension(290,40));
		
		galg = new JTextPane();
		galg.setPreferredSize(new Dimension(400,400));
		galg.setFont(new Font("", Font.PLAIN,30));
		galg.setForeground(Color.WHITE);
		galg.setBackground(new Color(47,45,45));
		
		reset = new JButton("Reset");//reset button voor de game.//moet denkt nog in een andere class.
		reset.setPreferredSize(new Dimension(150,30));
		reset.setFont(new Font("", Font.PLAIN, 20));
		reset.setForeground(Color.WHITE);
		reset.setBackground(new Color(29,27,27));
		reset.addActionListener(
				new ButtonCounterActionListener()
		);
		
		stuur = new JButton("Stuur");//stuurt de letter/geraden woord.//moet denkt nog in een andere class.
		stuur.setPreferredSize(new Dimension(150,30));
		stuur.setFont(new Font("", Font.PLAIN, 20));
		stuur.setForeground(Color.WHITE);
		stuur.setBackground(new Color(29,27,27));
		stuur.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tell++;
				ingevult[tell]=letter.getText();
				raad = raden.getText();
				Replace.gelijk(ingevult,tell,raad);
				letters.setText(Replace.replaceWoord); 
				letter.setText("");
				kansen = Replace.kansen;
				galg.setText(Replace.tekening);
				vak = (Replace.replaceWoord);
			}	
		});
		
		panel.add(naam);
		panel.add(enter);
		panel.add(letter);
		panel.add(raden);
		panel.add(enter2);
		panel.add(letters);
		panel.add(stuur);
		panel.add(reset);
		panel.add(galg);
		
	}
	
	public static void main(String[] args) {
	
		Woord woord = new  Woord(); //Woord class.
		replaceLetter Replace = new replaceLetter(); //replaceLetter class.
		
		woord.random();//pakt een random woord uit de classe woord.
		Replace.replace_woord();//maakt van het woord streepjes.
		
		vak = Replace.replaceWoord;
		
		SwingUtilities.invokeLater(new Runnable() {    	
    		public void run() {
    			new Index().setVisible(true);
    		}	
    	}); 
		
	}
}

