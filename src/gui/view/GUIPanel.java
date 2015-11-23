package gui.view;

import gui.controller.Controller;
import javax.swing.*;
import java.awt.event.*;

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
		
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, -80, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -51, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -106, SpringLayout.EAST, this);
		
		baseLayout.putConstraint(SpringLayout.NORTH, firstField, 35, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstField, -236, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstField, -10, SpringLayout.EAST, this);
		
	}
	
	private void setupListeners()
	{
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent click)
			{
				
			}
			
			public void mouseEntered(MouseEvent entered)
			{
				
			}
			
			public void mouseExited(MouseEvent exited)
			{
				
			}
			
			public void mouseReleased(MouseEvent released)
			{
				
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				
			}
		});
		
	}
}
