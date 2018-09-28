package windowBuilder.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class MoreLightsPanel extends JPanel{
	private static final long serialVersionUID = 1L;

	public JPanel moreLightsPanel;
	
	public JPanel allLightsControlPanel;
	public JLabel allLightsControlXAllLightsLabel;
	public JButton allLightsControlXLivingRoomFrontButton;
	public JButton allLightsControlXLivingRoomBackButton;
	public JButton allLightsControlXMainToiletButton;
	public JButton allLightsControlXBedroomButton;
	public JButton allLightsControlXKitchenButton;
	public JButton allLightsControlXDiningTableButton;
	public JButton allLightsControlXOfficeButton;
	
	public JPanel dynamicLightsControlPanel;
	public JPanel dynamicLightsControlPanelX;
	public JToggleButton dynamicLightsControlXOnOffButton;
	public JLabel dynamicLightsControlXOnOffLabel;
	public JLabel dynamicLightsControlXXXXLightsLabel;
	
	public MoreLightsPanel() {
		moreLightsPanel = new JPanel();
		moreLightsPanel.setLayout(new CardLayout(0, 0));
		
		allLightsControlPanel = new JPanel();
		allLightsControlPanel.setBackground(Color.WHITE);
		moreLightsPanel.add(allLightsControlPanel, "name_750922714006251");
		JPanel allLightsControlPanelX = new JPanel();
		allLightsControlPanelX.setLayout(null);
		allLightsControlPanelX.setBackground(Color.WHITE);
		
		allLightsControlXAllLightsLabel = new JLabel("All Lights");
		allLightsControlXAllLightsLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		allLightsControlXAllLightsLabel.setBounds(10, 11, 109, 14);
		allLightsControlPanelX.add(allLightsControlXAllLightsLabel);
		
		allLightsControlXLivingRoomFrontButton = new JButton("Living Room Front");
		allLightsControlXLivingRoomFrontButton.setHorizontalAlignment(SwingConstants.LEFT);
		allLightsControlXLivingRoomFrontButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		allLightsControlXLivingRoomFrontButton.setBounds(10, 35, 248, 40);
		allLightsControlPanelX.add(allLightsControlXLivingRoomFrontButton);
		
		allLightsControlXLivingRoomBackButton = new JButton("Living Room Back");
		allLightsControlXLivingRoomBackButton.setHorizontalAlignment(SwingConstants.LEFT);
		allLightsControlXLivingRoomBackButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		allLightsControlXLivingRoomBackButton.setBounds(261, 35, 248, 40);
		allLightsControlPanelX.add(allLightsControlXLivingRoomBackButton);
		
		allLightsControlXMainToiletButton = new JButton("Main toilet");
		allLightsControlXMainToiletButton.setHorizontalAlignment(SwingConstants.LEFT);
		allLightsControlXMainToiletButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		allLightsControlXMainToiletButton.setBounds(10, 86, 248, 40);
		allLightsControlPanelX.add(allLightsControlXMainToiletButton);
		
		allLightsControlXBedroomButton = new JButton("Bedroom");
		allLightsControlXBedroomButton.setHorizontalAlignment(SwingConstants.LEFT);
		allLightsControlXBedroomButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		allLightsControlXBedroomButton.setBounds(261, 86, 248, 40);
		allLightsControlPanelX.add(allLightsControlXBedroomButton);
		
		allLightsControlXKitchenButton = new JButton("Kitchen");
		allLightsControlXKitchenButton.setHorizontalAlignment(SwingConstants.LEFT);
		allLightsControlXKitchenButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		allLightsControlXKitchenButton.setBounds(10, 137, 248, 40);
		allLightsControlPanelX.add(allLightsControlXKitchenButton);
		
		allLightsControlXDiningTableButton = new JButton("Dining Table");
		allLightsControlXDiningTableButton.setHorizontalAlignment(SwingConstants.LEFT);
		allLightsControlXDiningTableButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		allLightsControlXDiningTableButton.setBounds(261, 137, 248, 40);
		allLightsControlPanelX.add(allLightsControlXDiningTableButton);
		
		allLightsControlXOfficeButton = new JButton("Office");
		allLightsControlXOfficeButton.setHorizontalAlignment(SwingConstants.LEFT);
		allLightsControlXOfficeButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		allLightsControlXOfficeButton.setBounds(10, 188, 248, 40);
		allLightsControlPanelX.add(allLightsControlXOfficeButton);
		
		GroupLayout gl_allLightsControlPanel = new GroupLayout(allLightsControlPanel);
		gl_allLightsControlPanel.setHorizontalGroup(
			gl_allLightsControlPanel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGroup(gl_allLightsControlPanel.createSequentialGroup()
					.addGap(32)
					.addComponent(allLightsControlPanelX, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
					.addGap(33))
		);
		gl_allLightsControlPanel.setVerticalGroup(
			gl_allLightsControlPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGroup(gl_allLightsControlPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(allLightsControlPanelX, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
					.addContainerGap())
		);
		allLightsControlPanel.setLayout(gl_allLightsControlPanel);
		
		dynamicLightsControlPanel = new JPanel();
		dynamicLightsControlPanel.setBackground(Color.WHITE);
		moreLightsPanel.add(dynamicLightsControlPanel, "name_750922748746884");
		dynamicLightsControlPanelX = new JPanel();
		dynamicLightsControlPanelX.setLayout(null);
		dynamicLightsControlPanelX.setBackground(Color.WHITE);
		
		dynamicLightsControlXXXXLightsLabel = new JLabel("XXX Lights");
		dynamicLightsControlXXXXLightsLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		dynamicLightsControlXXXXLightsLabel.setBounds(10, 11, 499, 14);
		dynamicLightsControlPanelX.add(dynamicLightsControlXXXXLightsLabel);
		
		dynamicLightsControlXOnOffLabel = new JLabel("On/Off");
		dynamicLightsControlXOnOffLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		dynamicLightsControlXOnOffLabel.setBounds(10, 36, 55, 40);
		dynamicLightsControlPanelX.add(dynamicLightsControlXOnOffLabel);
		
		dynamicLightsControlXOnOffButton = new JToggleButton("On");
		dynamicLightsControlXOnOffButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		dynamicLightsControlXOnOffButton.setBounds(75, 36, 121, 40);
		dynamicLightsControlPanelX.add(dynamicLightsControlXOnOffButton);
		
		GroupLayout gl_dynamicLightsControlPanel = new GroupLayout(dynamicLightsControlPanel);
		gl_dynamicLightsControlPanel.setHorizontalGroup(
			gl_dynamicLightsControlPanel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGroup(gl_dynamicLightsControlPanel.createSequentialGroup()
					.addGap(32)
					.addComponent(dynamicLightsControlPanelX, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
					.addGap(33))
		);
		gl_dynamicLightsControlPanel.setVerticalGroup(
			gl_dynamicLightsControlPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGroup(gl_dynamicLightsControlPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(dynamicLightsControlPanelX, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
					.addContainerGap())
		);
		dynamicLightsControlPanel.setLayout(gl_dynamicLightsControlPanel);
	}
}
