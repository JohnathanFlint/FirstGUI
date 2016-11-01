package graphic.view;

import javax.swing.JPanel;
import graphic.controller.FirstGUIController;
import java.awt.Color;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstPanel extends JPanel
{
	private FirstGUIController baseController;
	private JButton colorButton;
	private JButton randomButton;

	public FirstPanel(FirstGUIController baseController)
	{
		super();
		this.baseController = baseController;

		colorButton = new JButton("Color!");
		randomButton = new JButton("Random");

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setBackground(Color.DARK_GRAY);
		this.add(colorButton);
		this.add(randomButton);
	}

	private void setupLayout()
	{

	}

	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			//Creates an anonymous instance of a class that runs when the program starts. Allowing the click action to be performed.
			public void actionPerformed(ActionEvent click)
			{
				setBackground(Color.blue);
			}
		});
	}
}
