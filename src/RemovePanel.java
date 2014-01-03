import javax.swing.*;
import java.awt.BorderLayout;

public class RemovePanel extends JPanel {
	

	private RemovePanelCheckBoxes removePanelCheckBoxes;
	private static final long serialVersionUID = 1L;
	
	public RemovePanel(){
		
		removePanelCheckBoxes = new RemovePanelCheckBoxes();
	
		setLayout(new BorderLayout());
		
		add(removePanelCheckBoxes, BorderLayout.WEST);
		
	}	
}
