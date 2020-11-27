package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RaceGui implements ActionListener {
	int i = 0;
	private static JLabel nameLabel, success;
	private static JFrame frame;
	private static JPanel panel;
	private static JButton button;
	private static JTextField userText;

	public static void main(String[] args) {
		frame = new JFrame();
		panel = new JPanel();
//		panel.setBorder(BorderFactory.createEmptyBorder(300, 200, 100, 300));	// T R B L
		panel.setLayout(new GridLayout(0, 2)); // Rows and columns

		frame.setSize(350, 980);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("RacePrinter v1");
		frame.add(panel);

		panel.setLayout(null);

		nameLabel = new JLabel("Names: ");
		nameLabel.setBounds(10, 40, 80, 25);
		panel.add(nameLabel);

		userText = new JTextField(20);
		userText.setBounds(140, 40, 165, 840);
		panel.add(userText);

		button = new JButton("Generate");
		button.setBounds(10, 80, 120, 65);
		button.addActionListener(new RaceGui());
		panel.add(button);

		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) { // Tied to generate button object
		System.out.println("test");
	}

}

//https://www.youtube.com/watch?v=iE8tZ0hn2Ws