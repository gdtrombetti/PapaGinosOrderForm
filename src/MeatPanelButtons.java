import java.awt.*;
import javax.swing.*;

public class MeatPanelButtons extends JPanel {
	
	private JLabel nameOfButton;
	private ToppingPanel baconTopping;
	private ToppingPanel capicolaPanel;
	private ToppingPanel hamburgPanel;
	private ToppingPanel pepperoniPanel;
	private ToppingPanel meatballPanel;
	private ToppingPanel sausagePanel;
	private ToppingPanel chickenPanel;
	private ToppingPanel linguicaPanel; 
	
	private static final long serialVersionUID = 1L;

	
	public MeatPanelButtons(){
		
		setLayout(new GridLayout(15,1));
		
		nameOfButton = new JLabel("      None    Full    1st Half  2nd Half  Double    ");
		baconTopping = new ToppingPanel();
		capicolaPanel = new ToppingPanel();
		hamburgPanel = new ToppingPanel();
		pepperoniPanel = new ToppingPanel();
		meatballPanel= new ToppingPanel();
		sausagePanel = new ToppingPanel();
		chickenPanel = new ToppingPanel();
		linguicaPanel = new ToppingPanel();
	
	
		add(nameOfButton);
		add(baconTopping);
		add(capicolaPanel);
		add(hamburgPanel);
		add(pepperoniPanel);
		add(meatballPanel);
		add(sausagePanel);
		add(chickenPanel);
		add(linguicaPanel);
	}
}
