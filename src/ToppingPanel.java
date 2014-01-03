import javax.swing.*;

public class ToppingPanel extends JPanel {
	
	private JRadioButton none;
	private JRadioButton full;
	private JRadioButton fHalf;
	private JRadioButton sHalf;
	private ButtonGroup toppingGroup;


	
	private JCheckBox doubleTopping;

	
	private static final long serialVersionUID = 1L;
	
	public ToppingPanel(){
		
		none = new JRadioButton("    ",true);
		full = new JRadioButton("    ");
		fHalf = new JRadioButton("    ");
		sHalf = new JRadioButton("    ");
		doubleTopping = new JCheckBox("    ");
		
		
		
		toppingGroup = new ButtonGroup();
		toppingGroup.add(none);
		toppingGroup.add(full);
		toppingGroup.add(fHalf);
		toppingGroup.add(sHalf);
		
		//add(toppingLabel);
		add(none);
		add(full);
		add(fHalf);
		add(sHalf);
		add(doubleTopping);
	}
	
	
}
