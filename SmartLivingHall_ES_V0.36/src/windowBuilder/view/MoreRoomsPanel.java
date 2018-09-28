package windowBuilder.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;

public class MoreRoomsPanel extends JPanel{
	private static final long serialVersionUID = 1L;

	public JPanel moreRoomsPanel;
	
	public JPanel livingroomRoomsPanel;
	public JPanel bedroomRoomsPanel;
	public JPanel kitchenRoomsPanel;
	public JPanel maintoiletRoomsPanel;
	
	public MoreRoomsPanel() {
		moreRoomsPanel = new JPanel();
		moreRoomsPanel.setLayout(new CardLayout(0, 0));
		
		livingroomRoomsPanel = new JPanel();
		livingroomRoomsPanel.setBackground(Color.WHITE);
		moreRoomsPanel.add(livingroomRoomsPanel, "name_757386337870908");
		JPanel livingroomRoomsPanelX = new JPanel();
		livingroomRoomsPanelX.setLayout(null);
		livingroomRoomsPanelX.setBackground(Color.WHITE);
		
		JLabel livingroomRoomsXLivingRoomLabel = new JLabel("Living Room");
		livingroomRoomsXLivingRoomLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		livingroomRoomsXLivingRoomLabel.setBounds(10, 11, 109, 14);
		livingroomRoomsPanelX.add(livingroomRoomsXLivingRoomLabel);
		
		JButton livingroomRoomsXFrontLightsButton = new JButton("Front Lights");
		livingroomRoomsXFrontLightsButton.setHorizontalAlignment(SwingConstants.LEFT);
		livingroomRoomsXFrontLightsButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		livingroomRoomsXFrontLightsButton.setBounds(10, 35, 248, 40);
		livingroomRoomsPanelX.add(livingroomRoomsXFrontLightsButton);
		
		JButton livingroomRoomsXBackLightsButton = new JButton("Back Lights");
		livingroomRoomsXBackLightsButton.setHorizontalAlignment(SwingConstants.LEFT);
		livingroomRoomsXBackLightsButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		livingroomRoomsXBackLightsButton.setBounds(261, 35, 248, 40);
		livingroomRoomsPanelX.add(livingroomRoomsXBackLightsButton);
		
		JButton livingroomRoomsXFanButton = new JButton("Fan");
		livingroomRoomsXFanButton.setHorizontalAlignment(SwingConstants.LEFT);
		livingroomRoomsXFanButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		livingroomRoomsXFanButton.setBounds(10, 86, 248, 40);
		livingroomRoomsPanelX.add(livingroomRoomsXFanButton);
		
		GroupLayout gl_livingroomRoomsPanel = new GroupLayout(livingroomRoomsPanel);
		gl_livingroomRoomsPanel.setHorizontalGroup(
			gl_livingroomRoomsPanel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGroup(gl_livingroomRoomsPanel.createSequentialGroup()
					.addGap(32)
					.addComponent(livingroomRoomsPanelX, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
					.addGap(33))
		);
		gl_livingroomRoomsPanel.setVerticalGroup(
			gl_livingroomRoomsPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGroup(gl_livingroomRoomsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(livingroomRoomsPanelX, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
					.addContainerGap())
		);
		livingroomRoomsPanel.setLayout(gl_livingroomRoomsPanel);
		
		
		bedroomRoomsPanel = new JPanel();
		moreRoomsPanel.add(bedroomRoomsPanel, "name_761623182537803");
		bedroomRoomsPanel.setBackground(Color.WHITE);
		JPanel bedroomRoomsPanelX = new JPanel();
		bedroomRoomsPanelX.setLayout(null);
		bedroomRoomsPanelX.setBackground(Color.WHITE);
		
		JLabel bedroomRoomsXBedroomLabel = new JLabel("Bedroom");
		bedroomRoomsXBedroomLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		bedroomRoomsXBedroomLabel.setBounds(10, 11, 109, 14);
		bedroomRoomsPanelX.add(bedroomRoomsXBedroomLabel);
		
		JButton bedroomRoomsXFrontLightsButton = new JButton("Front Lights");
		bedroomRoomsXFrontLightsButton.setHorizontalAlignment(SwingConstants.LEFT);
		bedroomRoomsXFrontLightsButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bedroomRoomsXFrontLightsButton.setBounds(10, 35, 248, 40);
		bedroomRoomsPanelX.add(bedroomRoomsXFrontLightsButton);
		
		JButton bedroomRoomsXBackLightsButton = new JButton("Back Lights");
		bedroomRoomsXBackLightsButton.setHorizontalAlignment(SwingConstants.LEFT);
		bedroomRoomsXBackLightsButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bedroomRoomsXBackLightsButton.setBounds(261, 35, 248, 40);
		bedroomRoomsPanelX.add(bedroomRoomsXBackLightsButton);
		
		JButton bedroomRoomsXFanButton = new JButton("Fan");
		bedroomRoomsXFanButton.setHorizontalAlignment(SwingConstants.LEFT);
		bedroomRoomsXFanButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bedroomRoomsXFanButton.setBounds(10, 86, 248, 40);
		bedroomRoomsPanelX.add(bedroomRoomsXFanButton);
		
		GroupLayout gl_bedroomRoomsPanel = new GroupLayout(bedroomRoomsPanel);
		gl_bedroomRoomsPanel.setHorizontalGroup(
			gl_bedroomRoomsPanel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGroup(gl_bedroomRoomsPanel.createSequentialGroup()
					.addGap(32)
					.addComponent(bedroomRoomsPanelX, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
					.addGap(33))
		);
		gl_bedroomRoomsPanel.setVerticalGroup(
			gl_bedroomRoomsPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGroup(gl_bedroomRoomsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(bedroomRoomsPanelX, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
					.addContainerGap())
		);
		bedroomRoomsPanel.setLayout(gl_bedroomRoomsPanel);
		
		
		kitchenRoomsPanel = new JPanel();
		moreRoomsPanel.add(kitchenRoomsPanel, "name_761628759981670");
		kitchenRoomsPanel.setBackground(Color.WHITE);
		JPanel kitchenRoomsPanelX = new JPanel();
		kitchenRoomsPanelX.setLayout(null);
		kitchenRoomsPanelX.setBackground(Color.WHITE);
		
		JLabel kitchenRoomsXKitchenLabel = new JLabel("Kitchen");
		kitchenRoomsXKitchenLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		kitchenRoomsXKitchenLabel.setBounds(10, 11, 109, 14);
		kitchenRoomsPanelX.add(kitchenRoomsXKitchenLabel);
		
		JButton kitchenRoomsXMainLightsButton = new JButton("Main Lights");
		kitchenRoomsXMainLightsButton.setHorizontalAlignment(SwingConstants.LEFT);
		kitchenRoomsXMainLightsButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		kitchenRoomsXMainLightsButton.setBounds(10, 35, 248, 40);
		kitchenRoomsPanelX.add(kitchenRoomsXMainLightsButton);
		
		GroupLayout gl_kitchenRoomsPanel = new GroupLayout(kitchenRoomsPanel);
		gl_kitchenRoomsPanel.setHorizontalGroup(
			gl_kitchenRoomsPanel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGroup(gl_kitchenRoomsPanel.createSequentialGroup()
					.addGap(32)
					.addComponent(kitchenRoomsPanelX, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
					.addGap(33))
		);
		gl_kitchenRoomsPanel.setVerticalGroup(
			gl_kitchenRoomsPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGroup(gl_kitchenRoomsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(kitchenRoomsPanelX, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
					.addContainerGap())
		);
		kitchenRoomsPanel.setLayout(gl_kitchenRoomsPanel);
		
		
		maintoiletRoomsPanel = new JPanel();
		moreRoomsPanel.add(maintoiletRoomsPanel, "name_761578094621599");
		maintoiletRoomsPanel.setBackground(Color.WHITE);
		JPanel maintoiletRoomsPanelX = new JPanel();
		maintoiletRoomsPanelX.setLayout(null);
		maintoiletRoomsPanelX.setBackground(Color.WHITE);
		
		JLabel maintoiletRoomsXMainToiletLabel = new JLabel("Main Toilet");
		maintoiletRoomsXMainToiletLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		maintoiletRoomsXMainToiletLabel.setBounds(10, 11, 109, 14);
		maintoiletRoomsPanelX.add(maintoiletRoomsXMainToiletLabel);
		
		JButton maintoiletRoomsXLightsButton = new JButton("Lights");
		maintoiletRoomsXLightsButton.setHorizontalAlignment(SwingConstants.LEFT);
		maintoiletRoomsXLightsButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		maintoiletRoomsXLightsButton.setBounds(10, 35, 248, 40);
		maintoiletRoomsPanelX.add(maintoiletRoomsXLightsButton);
		
		GroupLayout gl_maintoiletRoomsPanel = new GroupLayout(maintoiletRoomsPanel);
		gl_maintoiletRoomsPanel.setHorizontalGroup(
			gl_maintoiletRoomsPanel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGroup(gl_maintoiletRoomsPanel.createSequentialGroup()
					.addGap(32)
					.addComponent(maintoiletRoomsPanelX, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
					.addGap(33))
		);
		gl_maintoiletRoomsPanel.setVerticalGroup(
			gl_maintoiletRoomsPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGroup(gl_maintoiletRoomsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(maintoiletRoomsPanelX, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
					.addContainerGap())
		);
		maintoiletRoomsPanel.setLayout(gl_maintoiletRoomsPanel);
	}
}
