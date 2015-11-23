package gui.view;

import gui.controller.Controller;

import javax.swing.*;

import java.awt.Color;
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
	
	private void changeRandomColor()
	{
		int red, green, blue;
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	
	private void setupListeners()
	{
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent click)
			{
				changeRandomColor();
			}
			
			public void mouseEntered(MouseEvent entered)
			{
				changeRandomColor();
			}
			
			public void mouseExited(MouseEvent exited)
			{
				changeRandomColor();
			}
			
			public void mouseReleased(MouseEvent released)
			{
				changeRandomColor();
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				changeRandomColor();
			}
		});
		
		this.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseMoved(MouseEvent moved)
			{
				if(moved.isAltDown())
				{
					changeRandomColor();
				}
			}
			
			public void mouseDragged(MouseEvent dragged)
			{
				changeRandomColor();
			}
			
		});
		
	}
}
