import java.awt.*;
import javax.swing.*;

public class NonMeatPanelLabels extends JPanel {

	private JLabel nonMeatName;
	private JLabel extraCheese;
	private JLabel fetaCheese;
	private JLabel broccoli;
	private JLabel greenPepper;
	private JLabel mushroom;
	private JLabel olive;
	private JLabel pineapple;
	private JLabel tomato;
	private JLabel tomChunk;
	private JLabel garlic;
	private JLabel bananaPepper;
	
	private static final long serialVersionUID = 1L;

	
	public NonMeatPanelLabels(){
		
		setLayout(new GridLayout(15,1));
		
		nonMeatName = new JLabel("Non-Meat");
		extraCheese = new JLabel("**  Extra Cheese                ");
		fetaCheese = new JLabel("**  Feta Cheese                ");
		broccoli = new JLabel("    Broccoli                ");
		greenPepper = new JLabel("    Green Pepper                ");
		mushroom = new JLabel("    Mushrooms                ");
		olive = new JLabel("    Olive                ");
		pineapple = new JLabel("    Pineapple                ");
		tomato = new JLabel("    Tomato                ");
		tomChunk = new JLabel("    Chunk Tomato                ");
		garlic = new JLabel("    Garlic                ");
		bananaPepper = new JLabel("    Banana Peppers                ");
		
		add(nonMeatName);
		add(extraCheese);
		add(fetaCheese);
		add(broccoli);
		add(greenPepper);
		add(mushroom);
		add(olive);
		add(pineapple);
		add(tomato);
		add(tomChunk);
		add(garlic);
		add(bananaPepper);
	}
}
