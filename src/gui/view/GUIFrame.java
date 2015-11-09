package gui.view;

import javax.swing.JFrame;
import gui.controller.Controller;

/**
 * @author jbur0473
 * @version 0.x Nov 9, 2015
 */

public class GUIFrame extends JFrame
{
	private Controller baseController;
	
	public GUIFrame(Controller baseController)
	{
		this.baseController = baseController;
	}
	
	private void setupFrame()
	{
		this.setSize(400,400);
		this.setVisible(true);
	}

}
