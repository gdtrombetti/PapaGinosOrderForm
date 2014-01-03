import java.awt.BorderLayout;
import javax.swing.*;

public class OptionsPanel extends JPanel {
	
	private SizePanel sizePanel;
	private RemovePanel removePanel;
	private OtherOptionsPanel otherOptionsPanel;
	
	private static final long serialVersionUID = 1L;

	
	public OptionsPanel(){
		
		sizePanel = new SizePanel();
		removePanel = new RemovePanel();
		otherOptionsPanel = new OtherOptionsPanel();

		
		setLayout(new BorderLayout());
		
		add(sizePanel, BorderLayout.NORTH);
		add(removePanel, BorderLayout.CENTER);
		add(otherOptionsPanel, BorderLayout.SOUTH);

		
		setVisible(true);
		
	}

}
