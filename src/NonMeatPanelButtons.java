import java.awt.*;
import javax.swing.*;

public class NonMeatPanelButtons extends JPanel {
	
	private JLabel nameOfButton;
	private ToppingPanel extraCheese;
	private ToppingPanel fetaCheese;
	private ToppingPanel broccoli;
	private ToppingPanel greenPepper;
	private ToppingPanel mushroom;
	private ToppingPanel olive;
	private ToppingPanel pineapple;
	private ToppingPanel tomato;
	private ToppingPanel tomChunk;
	private ToppingPanel garlic;
	private ToppingPanel bananaPepper;
	
	private static final long serialVersionUID = 1L;

	
	public NonMeatPanelButtons(){
		
		setLayout(new GridLayout(15,1));
		
		nameOfButton = new JLabel("      None    Full    1st Half  2nd Half  Double    ");
		extraCheese = new ToppingPanel();
		fetaCheese = new ToppingPanel();
		broccoli = new ToppingPanel();
		greenPepper = new ToppingPanel();
		mushroom = new ToppingPanel();
		olive = new ToppingPanel();
		pineapple = new ToppingPanel();
		tomato = new ToppingPanel();
		tomChunk = new ToppingPanel();
		garlic = new ToppingPanel();
		bananaPepper = new ToppingPanel();
		
		
		add(nameOfButton);
		add (extraCheese);
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
