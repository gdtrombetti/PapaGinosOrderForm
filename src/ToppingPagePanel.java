import java.awt.*;
import javax.swing.*;

public class ToppingPagePanel extends JPanel {
	
	private MeatPanel meatPanel;
	private NonMeatPanel nonMeatPanel;
	private ToppingsHeaderPanel toppingsHeaderPanel;

	
	private static final long serialVersionUID = 1L;
	
	public ToppingPagePanel(){
		
		meatPanel = new MeatPanel();
		nonMeatPanel = new NonMeatPanel();
		toppingsHeaderPanel =  new ToppingsHeaderPanel();

		
		setLayout(new BorderLayout());
		
		add(toppingsHeaderPanel, BorderLayout.NORTH);
		add(meatPanel, BorderLayout.WEST);
		add(nonMeatPanel, BorderLayout.EAST);

	}
}
