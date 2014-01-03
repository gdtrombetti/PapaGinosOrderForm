import javax.swing.*;

public class BottomPanel extends JPanel {

	private JButton addToOrder;
	private JButton cancel;
	
	private static final long serialVersionUID = 1L;
	
	public BottomPanel(){
		addToOrder = new JButton("Add To Order");
		cancel = new JButton("Cancle");
		
		//Button Listeners - will implement after UI is complete.
		//addToOrder.addActionListener(new ButtomListener());
		//cancel.addActionListener(new ButtonListener());
		
		add(addToOrder);
		add(cancel);
	}
}
