/**
 * 
 */
package gui.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import gui.controller.Controller;
import gui.view.GUIFrame;
import gui.view.GUIPanel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author CodyH
 * @version 0.x Nov 12, 2015
 *
 */
public class GUIFrameTest
{

	private GUIFrame testFrame;
	private GUIPanel testPanel;
	private Controller testController;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		testController = new Controller();
		testFrame = new GUIFrame(testController);
		testPanel = new GUIPanel(testController);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
		testFrame = null;
		testPanel = null;
		testController = null;
	}

	/**
	 * Test method for {@link gui.view.GUIFrame#GUIFrame(gui.controller.GUIAppController)}.
	 */
	@Test
	public void testGUIFrame()
	{
		assertTrue(testFrame.getContentPane() instanceof GUIPanel);
		assertTrue(testFrame.isVisible());
		assertTrue(testFrame.getWidth() > 100);
		assertTrue(testFrame.getHeight() > 100);
	}
	

	/**
	 * Test method for {@link gui.view.GUIFrame#getBaseController()}.
	 */
	@Test
	public void testGetBaseController()
	{
		assertNotNull(testFrame.getBaseController());
		assertTrue(testFrame.getBaseController() instanceof Controller);
	}

}
