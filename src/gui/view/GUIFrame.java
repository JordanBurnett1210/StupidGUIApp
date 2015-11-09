package gui.view;

import javax.swing.JFrame;
import gui.controller.Controller;

/**
 * @author jbur0473
 * @version 0.x Nov 9, 2015
 * 
 */

public class GUIFrame extends JFrame
{
	private Controller baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(Controller baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); //must be first line of setupFrame!
		this.setSize(400,400);			//Find a good size for the app.
		this.setTitle("silly app!!");
		this.setResizable(false);		//Advisable not required.
		this.setVisible(true);			//Must be last line of setupFrame!
	}
	
	public Controller getBaseController()
	{
		return baseController;
	}

}
