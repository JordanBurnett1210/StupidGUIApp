package gui.view;

import javax.swing.JPanel;
import gui.controller.Controller;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * @author jbur0473
 * @version 0.x Nov 9, 2015
 *
 */

public class GUIPanel extends JPanel
{
	private Controller baseController;
	private JButton firstButton;
	private JTextField firstField;
	
	public GUIPanel(Controller baseController)
	{
		this.baseController = baseController;
		
		firstButton = new JButton("Please do not click the button");
		firstField = new JTextField("words can be typed here");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
