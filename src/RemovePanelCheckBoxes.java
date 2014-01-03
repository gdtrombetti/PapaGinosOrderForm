import javax.swing.*;
import java .awt.*;

public class RemovePanelCheckBoxes extends JPanel {
	
	private JCheckBox noSauce;
	private JCheckBox noCheese;
	
	private static final long serialVersionUID = 1L;
	
	

	public RemovePanelCheckBoxes() {
		
		setLayout(new GridLayout(1,2));
		
		noCheese = new JCheckBox(" No Cheese");
		noSauce = new JCheckBox(" No Sauce");
		
		setBorder(BorderFactory.createTitledBorder("Remove"));
		
		add(noCheese);
		add(noSauce);
	}
	
	public String toString(){
		
		String output = "";
		
		if(noCheese.isSelected())
			output += "Your Pizza Has No Cheese ";
		if(noSauce.isSelected())
			output += " Your Pizza Has No Sauce ";
		else
			output = "";
		
		return output;
	}
}
