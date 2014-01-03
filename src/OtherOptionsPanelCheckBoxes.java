import javax.swing.*;
import java .awt.*;

public class OtherOptionsPanelCheckBoxes extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JCheckBox cookLight;
	private JCheckBox wellDone;
	
	private JCheckBox extraSauce;
	private JCheckBox lightSauce;
	
	private JCheckBox lightCheese;
	
	
	
	public OtherOptionsPanelCheckBoxes(){
		
		
		cookLight = new JCheckBox(" Cook Lite");
		wellDone = new JCheckBox(" Well Done");
		extraSauce = new JCheckBox(" Extra Sauce");
		lightSauce = new JCheckBox(" Light Sauce");
		lightCheese = new JCheckBox(" Light Cheese");
		
		
		setLayout(new GridLayout(3,2));
		setBorder(BorderFactory.createTitledBorder("Cooking Instructions"));
		
		add(cookLight);
		add(extraSauce);
		add(lightSauce);
		add(wellDone);
		add(lightCheese);
		
		
	}
}
