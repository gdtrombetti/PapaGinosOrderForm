import javax.swing.*;
import java.awt.*;

public class PizzaBuilderGUI extends JFrame {
	
	private static final int WINDOW_WIDTH = 800;
	private static final int WINDOW_LENGTH = 800;
	
	
	private static final long serialVersionUID = 1L;


	public PizzaBuilderGUI(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setSize(WINDOW_WIDTH, WINDOW_LENGTH);
		
		OptionsPanel pizzaOptions = new OptionsPanel();
		ToppingPagePanel newToppingPagePanel = new ToppingPagePanel();
		BottomPanel newBottomPanel = new BottomPanel();
		
		add(pizzaOptions, BorderLayout.NORTH);
		add(newToppingPagePanel, BorderLayout.CENTER);
		add(newBottomPanel, BorderLayout.SOUTH);
			
		
		setVisible(true);
	}
		

	public static void main(String[] args) {
		
		new PizzaBuilderGUI();
	}

}
