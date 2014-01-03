import java.awt.*;
import javax.swing.*;

public class NonMeatPanel extends JPanel {
	
	private NonMeatPanelLabels nonMeatPanelLabels;
	private NonMeatPanelButtons nonMeatPanelButtons;
	
	private static final long serialVersionUID = 1L;
	
	public NonMeatPanel(){
		
		setLayout(new BorderLayout());
		
		nonMeatPanelLabels = new NonMeatPanelLabels();
		nonMeatPanelButtons = new NonMeatPanelButtons();
		
		add(nonMeatPanelLabels, BorderLayout.WEST);
		add(nonMeatPanelButtons, BorderLayout.EAST);
	}
}
