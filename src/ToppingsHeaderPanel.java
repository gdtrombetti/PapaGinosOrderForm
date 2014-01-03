import java.awt.*;
import javax.swing.*;

public class ToppingsHeaderPanel extends JPanel {
	
	private JLabel headerText;
	private JLabel headerSeperator;
	private JLabel headerSeperator2;
	private static final long serialVersionUID = 1L;
	private ToppingTypeOutput toppingTypeOutput;
	
	public ToppingsHeaderPanel(){
		
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createTitledBorder(""));
		
		toppingTypeOutput = new ToppingTypeOutput();
		
		headerText = new JLabel("Toppings");
		headerSeperator = new JLabel("-----------------------------------------------------------" +
							"--------------------------------------------------------------------" + 
							"--------------------------------------------------------------------");
		headerSeperator2 = new JLabel("-----------------------------------------------------------" +
							"--------------------------------------------------------------------" + 
							"--------------------------------------------------------------------");

		add(headerSeperator, BorderLayout.NORTH);
		add(headerText, BorderLayout.WEST);
		add(toppingTypeOutput, BorderLayout.EAST);
		add(headerSeperator2, BorderLayout.SOUTH);
	}
	


}