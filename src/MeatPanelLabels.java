import java.awt.*;
import javax.swing.*;

public class MeatPanelLabels extends JPanel {

	private JLabel meatName;
	private JLabel baconTopping;
	private JLabel capicolaPanel;
	private JLabel hamburgPanel;
	private JLabel pepperoniPanel;
	private JLabel meatballPanel;
	private JLabel sausagePanel;
	private JLabel chickenPanel;
	private JLabel linguicaPanel; 
	
	private static final long serialVersionUID = 1L;

	
	public MeatPanelLabels(){
		
		setLayout(new GridLayout(15,1));
		
		meatName = new JLabel("Meat");
		baconTopping = new JLabel("    Bacon                ");
		capicolaPanel = new JLabel("    Capicola                ");
		hamburgPanel = new JLabel("    Hamburg                ");
		pepperoniPanel = new JLabel("    Pepperoni                ");
		meatballPanel= new JLabel("    MeatBalls                ");
		sausagePanel = new JLabel("    Sausage                ");
		chickenPanel = new JLabel("**  Chicken                ");
		linguicaPanel = new JLabel("    Linguica                ");
	
	
		add(meatName);
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
