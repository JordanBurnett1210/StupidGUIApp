package gui.view;

import javax.swing.JPanel;
import gui.controller.Controller;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

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
	private SpringLayout baseLayout;
	
	public GUIPanel(Controller baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("Please do not click the button");
		firstField = new JTextField("words can be typed here");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Helper method to load all GUI components into the panel.
	 */	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstField);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
