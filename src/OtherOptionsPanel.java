import javax.swing.*;
import java.awt.BorderLayout;

public class OtherOptionsPanel extends JPanel {
	

	private OtherOptionsPanelCheckBoxes otherOptionsPanelCheckBoxes;
	private static final long serialVersionUID = 1L;
	
	public OtherOptionsPanel(){
		
		otherOptionsPanelCheckBoxes = new OtherOptionsPanelCheckBoxes();
	
		setLayout(new BorderLayout());
		
		add(otherOptionsPanelCheckBoxes, BorderLayout.WEST);
		
	}	
}
