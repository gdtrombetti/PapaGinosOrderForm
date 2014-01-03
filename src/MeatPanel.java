import java.awt.*;
import javax.swing.*;

public class MeatPanel extends JPanel {
	
	private MeatPanelLabels meatPanelLabels;
	private MeatPanelButtons meatPanelButtons;
	
	private static final long serialVersionUID = 1L;
	
	public MeatPanel(){
		
		setLayout(new BorderLayout());
		
		meatPanelLabels = new MeatPanelLabels();
		meatPanelButtons = new MeatPanelButtons();
		
		add(meatPanelLabels, BorderLayout.WEST);
		add(meatPanelButtons, BorderLayout.EAST);
	}
}
