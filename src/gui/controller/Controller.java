package gui.controller;

import gui.view.GUIFrame;

/**
 * AppController for the Stupid GUI Application
 * @author jbur0473
 * @version 0.x Nov 9, 2015
 */

public class Controller
{
	/**
	 * Reference to the GUIFrame object for internal use.
	 */
	
	private GUIFrame baseFrame;
	
	/**
	 * Creates a GUIAppController and initializes the GUIFrame.
	 */
	
	public GUIAppController()
	{
		baseFrame = new GUIFrame(this);
	}
	
	public voidstart()
	{}
}
