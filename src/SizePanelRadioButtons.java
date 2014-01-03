import java.awt.*;
import javax.swing.*;

public class SizePanelRadioButtons extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private final static String SMALL_SIZE =  "Small - 7.99 + 1.00 / reg toppings + 1.50 / prem topping";
	private final static String LARGE_SIZE = "Large - 11.99 + 1.50 / reg toppings + 2.00 / prem topping";
	private final static String XLARGE_SIZE = " Extra Large - 13.99 + 1.50 / reg toppings + 2.00 / prem topping";
	
	private String size;
	
	private JRadioButton smallButton;
	private JRadioButton largeButton;
	private JRadioButton xLargeButton;
	private ButtonGroup sizeButtonGroup;
	
	public SizePanelRadioButtons(){
		setLayout(new GridLayout(3,1));
		setBorder(BorderFactory.createTitledBorder("Size *"));
		
		smallButton = new JRadioButton(SMALL_SIZE,true);
		largeButton = new JRadioButton(LARGE_SIZE);
		xLargeButton = new JRadioButton(XLARGE_SIZE);
		
		sizeButtonGroup = new ButtonGroup();
		sizeButtonGroup.add(smallButton);
		sizeButtonGroup.add(largeButton);
		sizeButtonGroup.add(xLargeButton);
		
		add(smallButton);
		add(largeButton);
		add(xLargeButton);
		
	}
	
	public String getPrefferedSize(){
		if(smallButton.isSelected())
			size = SMALL_SIZE;
		else if(largeButton.isSelected())
			size = LARGE_SIZE;
		else if (xLargeButton.isSelected())
			size = XLARGE_SIZE;
		return size;
	}

}
