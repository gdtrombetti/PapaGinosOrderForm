import java.awt.*;
import javax.swing.*;

public class ToppingTypeOutput extends JPanel {

	private JLabel text;
	private JLabel text1;
	private JLabel text2;
	private JLabel text3;
	
	private static final long serialVersionUID = 1L;
	
	public ToppingTypeOutput(){
		
		setLayout(new GridLayout(2,2));
		
		text = new JLabel("Regular Topping          ");
		text1 = new JLabel("** Premium Topping          ");
		text2 = new JLabel("($1.50 ea.)");
		text3 = new JLabel("($2.00 ea.)");
		
		add(text);
		add(text1);
		add(text2);
		add(text3);
		
	}
	
	
}
