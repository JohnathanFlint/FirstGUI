package graphic.view;

import javax.swing.JPanel;
import graphic.controller.FirstGUIController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstPanel extends JPanel
{
	private FirstGUIController baseController;
	private JButton colorButton;
	private JButton randomButton;
	private SpringLayout baseLayout;

	public FirstPanel(FirstGUIController baseController)
	{
		super();
		this.baseController = baseController;

		colorButton = new JButton("Color!");
		randomButton = new JButton("Random");
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, 0, SpringLayout.WEST, colorButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, colorButton, -82, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, colorButton, -91, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, 80, SpringLayout.NORTH, this);
	
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
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
