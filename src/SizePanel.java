import javax.swing.*;
import java.awt.BorderLayout;

public class SizePanel extends JPanel {
	

	private SizePanelRadioButtons sizePanelRadioButtons;
	private static final long serialVersionUID = 1L;
	
	public SizePanel(){
		
		sizePanelRadioButtons = new SizePanelRadioButtons();
	
		setLayout(new BorderLayout());
		
		add(sizePanelRadioButtons, BorderLayout.WEST);
		
	}	
}
