package windowBuilder.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Big4Panel extends JPanel{
	private static final long serialVersionUID = 1L;

	public JPanel big4Panels;
	
	public JPanel defaultMenuPanel;
	public JLabel defaultMenuClockLabel;
	public JLabel defaultMenuTemperatureLabel;
	
	public JPanel roomsPanel;
	public JPanel roomsPanelX;
	public JLabel roomsXFavouriteLabel;
	public JButton roomsXLivingRoomButton;
	public JButton roomsXBedroomButton;
	public JButton roomsXKitchenButton;
	public JButton roomsXMainToiletButton;
	public JLabel roomsXAllOthersLabel;
	public JButton roomsXOfficeButton;
	public JButton roomsXXBedroomButton;
	public JButton roomsXMasterToiletButton;
	public JButton roomXDiningTableButton;
	
	public JPanel controlPanel;
	public JButton controlXDoorsButton;
	public JButton controlXSensorsAlarmButton;
	public JButton controlXCamerasButton;
	public JLabel controlXCategoriesLabel;
	public JButton controlXLightsButton;
	public JButton controlXCoolingVentilationButton;
	public JButton controlXWindowsButton;
	public JButton controlXCurtainsButton;
	
	public JPanel settingsPanel;
	public JLabel settingsXGeneralLabel;
	public JButton settingsXAboutButton;
	public JButton settingsXContactUsButton;
	public JButton settingsXLanguageButton;
	public JLabel settingsXManageLabel;
	public JButton settingsXManageDevicesButton;
	
	public Big4Panel() {
		big4Panels = new JPanel();
		big4Panels.setLayout(new CardLayout(0, 0));
		
		defaultMenuPanel = new JPanel();
		defaultMenuPanel.setLayout(null);
		defaultMenuPanel.setBorder(null);
		defaultMenuPanel.setBackground(Color.WHITE);
		
		JLabel defaultMenuStautsLabel = new JLabel("Status: ");
		defaultMenuStautsLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		defaultMenuStautsLabel.setBounds(10, 11, 63, 21);
		defaultMenuPanel.add(defaultMenuStautsLabel);
		
		JScrollPane defaultMenuScrollPane = new JScrollPane();
		defaultMenuScrollPane.setBounds(72, 11, 279, 190);
		defaultMenuPanel.add(defaultMenuScrollPane);
		
		JTextArea defaultMenuStatusTextArea = new JTextArea();
		defaultMenuStatusTextArea.setText("Burglar Protection:                   DISARMED\r\nFire Protection:                              ARMED\r\nWindow Protection:                       ARMED\r\n------------------------------------------------------\r\nStatus:");
		defaultMenuStatusTextArea.setFont(new Font("Dialog", Font.PLAIN, 15));
		defaultMenuStatusTextArea.setEditable(false);
		defaultMenuScrollPane.setViewportView(defaultMenuStatusTextArea);
		
		JPanel defaultMenuClockTemperaturePanel = new JPanel();
		defaultMenuClockTemperaturePanel.setBounds(357, 11, 217, 190);
		defaultMenuPanel.add(defaultMenuClockTemperaturePanel);
		defaultMenuClockTemperaturePanel.setLayout(new GridLayout(2, 0, 0, 0));
		
		defaultMenuClockLabel = new JLabel("CLOCK");
		defaultMenuClockLabel.setOpaque(true);
		defaultMenuClockLabel.setHorizontalAlignment(SwingConstants.CENTER);
		defaultMenuClockLabel.setFont(new Font("Dialog", Font.PLAIN, 50));
		defaultMenuClockLabel.setBackground(Color.WHITE);
		defaultMenuClockTemperaturePanel.add(defaultMenuClockLabel);
		
		defaultMenuTemperatureLabel = new JLabel("00\u00B0C");
		defaultMenuTemperatureLabel.setOpaque(true);
		defaultMenuTemperatureLabel.setHorizontalAlignment(SwingConstants.CENTER);
		defaultMenuTemperatureLabel.setFont(new Font("Dialog", Font.PLAIN, 50));
		defaultMenuTemperatureLabel.setBackground(Color.WHITE);
		defaultMenuClockTemperaturePanel.add(defaultMenuTemperatureLabel);
		
		JSeparator defaultMenuSeperator = new JSeparator();
		defaultMenuSeperator.setBounds(10, 217, 564, 2);
		defaultMenuPanel.add(defaultMenuSeperator);
		
		JPanel defaultMenuQuickButtonsPanel = new JPanel();
		defaultMenuQuickButtonsPanel.setLayout(null);
		defaultMenuQuickButtonsPanel.setBackground(Color.WHITE);
		defaultMenuQuickButtonsPanel.setBounds(10, 224, 564, 80);
		defaultMenuPanel.add(defaultMenuQuickButtonsPanel);
		
		JButton defaultMenuQuickHomeButton = new JButton("");
		defaultMenuQuickHomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Welcome Home: Main Lights On");
				defaultMenuStatusTextArea.setText("Burglar Protection:                   DISARMED\r\n" + 
						"Fire Protection:                              ARMED\r\n" + 
						"Window Protection:                       ARMED\r\n" + 
						"------------------------------------------------------\r\n" + 
						"Status: \r\n" + 
						"- Main Lights On\r\n" +
						"- Doors Partially Secured");
			}
		});
		defaultMenuQuickHomeButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/home (2).png")));
		defaultMenuQuickHomeButton.setOpaque(true);
		defaultMenuQuickHomeButton.setForeground(Color.BLACK);
		defaultMenuQuickHomeButton.setFont(new Font("Roboto", Font.PLAIN, 15));
		defaultMenuQuickHomeButton.setBackground(Color.WHITE);
		defaultMenuQuickHomeButton.setBounds(40, 11, 100, 63);
		defaultMenuQuickButtonsPanel.add(defaultMenuQuickHomeButton);
		
		JButton defaultMenuQuickSleepButton = new JButton("");
		defaultMenuQuickSleepButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Good Night: All Lights Off, Doors Fully Secured");
				defaultMenuStatusTextArea.setText("Burglar Protection:                   DISARMED\r\n" + 
						"Fire Protection:                              ARMED\r\n" + 
						"Window Protection:                       ARMED\r\n" + 
						"------------------------------------------------------\r\n" + 
						"Status:\r\n" + 
						"- All Lights Off\r\n" + 
						"- Doors Fully Secured");
			}
		});
		defaultMenuQuickSleepButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/moon.png")));
		defaultMenuQuickSleepButton.setFont(new Font("Roboto", Font.PLAIN, 15));
		defaultMenuQuickSleepButton.setBackground(Color.WHITE);
		defaultMenuQuickSleepButton.setBounds(170, 11, 100, 63);
		defaultMenuQuickButtonsPanel.add(defaultMenuQuickSleepButton);
		
		JButton defaultMenuQuickWakeButton = new JButton("");
		defaultMenuQuickWakeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Good Morning: Main Lights On, Doors Partially Secured");
				defaultMenuStatusTextArea.setText("Burglar Protection:                   DISARMED\r\n" + 
						"Fire Protection:                              ARMED\r\n" + 
						"Window Protection:                       ARMED\r\n" + 
						"------------------------------------------------------\r\n" + 
						"Status:\r\n" + 
						"- Main Lights On\r\n" + 
						"- Doors Partially Secured");
			}
		});
		defaultMenuQuickWakeButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/sun (2).png")));
		defaultMenuQuickWakeButton.setFont(new Font("Roboto", Font.PLAIN, 15));
		defaultMenuQuickWakeButton.setBackground(Color.WHITE);
		defaultMenuQuickWakeButton.setBounds(298, 11, 100, 63);
		defaultMenuQuickButtonsPanel.add(defaultMenuQuickWakeButton);
		
		JButton defaultMenuQuickExitButton = new JButton("");
		defaultMenuQuickExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Good Bye: All Lights Off, Doors Fully Secured");
				defaultMenuStatusTextArea.setText("Burglar Protection:                   DISARMED\r\n" + 
						"Fire Protection:                              ARMED\r\n" + 
						"Window Protection:                       ARMED\r\n" + 
						"------------------------------------------------------\r\n" + 
						"Status:\r\n" + 
						"- All Lights Off\r\n" + 
						"- Doors Fully Secured");
			}
		});
		defaultMenuQuickExitButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/exit (2).png")));
		defaultMenuQuickExitButton.setFont(new Font("Roboto", Font.PLAIN, 15));
		defaultMenuQuickExitButton.setBackground(Color.WHITE);
		defaultMenuQuickExitButton.setBounds(426, 11, 100, 63);
		defaultMenuQuickButtonsPanel.add(defaultMenuQuickExitButton);

		big4Panels.add(defaultMenuPanel, "name_751539544022979");
		
		roomsPanel = new JPanel();
		roomsPanel.setBackground(Color.WHITE);
		roomsPanelX = new JPanel();
		roomsPanelX.setLayout(null);
		roomsPanelX.setBackground(Color.WHITE);
		
		roomsXFavouriteLabel = new JLabel("Favourites");
		roomsXFavouriteLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		roomsXFavouriteLabel.setBounds(10, 11, 109, 14);
		roomsPanelX.add(roomsXFavouriteLabel);
		
		roomsXLivingRoomButton = new JButton("Living Room");
		roomsXLivingRoomButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/sofa-with-armrest.png")));
		roomsXLivingRoomButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		roomsXLivingRoomButton.setBounds(10, 35, 122, 91);
		roomsPanelX.add(roomsXLivingRoomButton);
		
		roomsXBedroomButton = new JButton("Bedroom");
		roomsXBedroomButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/bed.png")));
		roomsXBedroomButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		roomsXBedroomButton.setBounds(136, 35, 122, 91);
		roomsPanelX.add(roomsXBedroomButton);
		
		roomsXKitchenButton = new JButton("Kitchen");
		roomsXKitchenButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/chef.png")));
		roomsXKitchenButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		roomsXKitchenButton.setBounds(261, 35, 122, 91);
		roomsPanelX.add(roomsXKitchenButton);
		
		roomsXMainToiletButton = new JButton("Main Toilet");
		roomsXMainToiletButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/toilet-.png")));
		roomsXMainToiletButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		roomsXMainToiletButton.setBounds(387, 35, 122, 91);
		roomsPanelX.add(roomsXMainToiletButton);
		
		roomsXAllOthersLabel = new JLabel("All (Others)");
		roomsXAllOthersLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		roomsXAllOthersLabel.setBounds(10, 137, 109, 14);
		roomsPanelX.add(roomsXAllOthersLabel);
		
		roomsXOfficeButton = new JButton("Office");
		roomsXOfficeButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/pc-computer-with-monitor.png")));
		roomsXOfficeButton.setHorizontalAlignment(SwingConstants.LEFT);
		roomsXOfficeButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		roomsXOfficeButton.setBounds(10, 161, 248, 40);
		roomsPanelX.add(roomsXOfficeButton);
		
		roomsXXBedroomButton = new JButton("X's Bedroom");
		roomsXXBedroomButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/bunk-bed.png")));
		roomsXXBedroomButton.setHorizontalAlignment(SwingConstants.LEFT);
		roomsXXBedroomButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		roomsXXBedroomButton.setBounds(261, 161, 248, 40);
		roomsPanelX.add(roomsXXBedroomButton);
		
		roomsXMasterToiletButton = new JButton("Master Toilet");
		roomsXMasterToiletButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/toilet.png")));
		roomsXMasterToiletButton.setHorizontalAlignment(SwingConstants.LEFT);
		roomsXMasterToiletButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		roomsXMasterToiletButton.setBounds(10, 212, 248, 40);
		roomsPanelX.add(roomsXMasterToiletButton);
		
		roomXDiningTableButton = new JButton("Dining Table");
		roomXDiningTableButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/dining-room-cutlery-set-of-three-pieces-in-silhouettes.png")));
		roomXDiningTableButton.setHorizontalAlignment(SwingConstants.LEFT);
		roomXDiningTableButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		roomXDiningTableButton.setBounds(261, 212, 248, 40);
		roomsPanelX.add(roomXDiningTableButton);
		
		GroupLayout gl_roomsPanel = new GroupLayout(roomsPanel);
		gl_roomsPanel.setHorizontalGroup(
			gl_roomsPanel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGroup(gl_roomsPanel.createSequentialGroup()
					.addGap(32)
					.addComponent(roomsPanelX, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
					.addGap(33))
		);
		gl_roomsPanel.setVerticalGroup(
			gl_roomsPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGroup(gl_roomsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(roomsPanelX, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
					.addContainerGap())
		);
		roomsPanel.setLayout(gl_roomsPanel);
		
		big4Panels.add(roomsPanel, "name_751749217886291");
		
		controlPanel = new JPanel();
		controlPanel.setBackground(Color.WHITE);
		//big4Panels.add(controlPanel, "name_752127286365182");
		JPanel controlPanelX = new JPanel();
		controlPanelX.setLayout(null);
		controlPanelX.setBackground(Color.WHITE);
		
		controlXCategoriesLabel = new JLabel("Categories");
		controlXCategoriesLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		controlXCategoriesLabel.setBounds(10, 11, 109, 14);
		controlPanelX.add(controlXCategoriesLabel);
		
		controlXLightsButton = new JButton("Lights");
		controlXLightsButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/light-bulb.png")));
		controlXLightsButton.setHorizontalAlignment(SwingConstants.LEFT);
		controlXLightsButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		controlXLightsButton.setBounds(10, 35, 248, 40);
		controlPanelX.add(controlXLightsButton);
		
		controlXCoolingVentilationButton = new JButton("Cooling & Ventilation");
		controlXCoolingVentilationButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/fan.png")));
		controlXCoolingVentilationButton.setHorizontalAlignment(SwingConstants.LEFT);
		controlXCoolingVentilationButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		controlXCoolingVentilationButton.setBounds(261, 35, 248, 40);
		controlPanelX.add(controlXCoolingVentilationButton);
		
		controlXWindowsButton = new JButton("Windows");
		controlXWindowsButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/window.png")));
		controlXWindowsButton.setHorizontalAlignment(SwingConstants.LEFT);
		controlXWindowsButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		controlXWindowsButton.setBounds(10, 86, 248, 40);
		controlPanelX.add(controlXWindowsButton);
		
		controlXCurtainsButton = new JButton("Curtains");
		controlXCurtainsButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/livingroom-window-with-curtains.png")));
		controlXCurtainsButton.setHorizontalAlignment(SwingConstants.LEFT);
		controlXCurtainsButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		controlXCurtainsButton.setBounds(261, 86, 248, 40);
		controlPanelX.add(controlXCurtainsButton);
		
		controlXDoorsButton = new JButton("Doors");
		controlXDoorsButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/door.png")));
		controlXDoorsButton.setHorizontalAlignment(SwingConstants.LEFT);
		controlXDoorsButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		controlXDoorsButton.setBounds(10, 137, 248, 40);
		controlPanelX.add(controlXDoorsButton);
		
		controlXSensorsAlarmButton = new JButton("Sensors & Alarms");
		controlXSensorsAlarmButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/bell.png")));
		controlXSensorsAlarmButton.setHorizontalAlignment(SwingConstants.LEFT);
		controlXSensorsAlarmButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		controlXSensorsAlarmButton.setBounds(261, 137, 248, 40);
		controlPanelX.add(controlXSensorsAlarmButton);
		
		controlXCamerasButton = new JButton("Cameras");
		controlXCamerasButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/camera.png")));
		controlXCamerasButton.setHorizontalAlignment(SwingConstants.LEFT);
		controlXCamerasButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		controlXCamerasButton.setBounds(10, 188, 248, 40);
		controlPanelX.add(controlXCamerasButton);
		
		GroupLayout gl_controlPanel = new GroupLayout(controlPanel);
		gl_controlPanel.setHorizontalGroup(
			gl_controlPanel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGroup(gl_controlPanel.createSequentialGroup()
					.addGap(32)
					.addComponent(controlPanelX, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
					.addGap(33))
		);
		gl_controlPanel.setVerticalGroup(
			gl_controlPanel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGroup(gl_controlPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(controlPanelX, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
					.addContainerGap())
		);
		controlPanel.setLayout(gl_controlPanel);
		
		big4Panels.add(controlPanel, "name_752127286365182");
		
		settingsPanel = new JPanel();
		settingsPanel.setBackground(Color.WHITE);
		
		JPanel settingsPanelX = new JPanel();
		settingsPanelX.setLayout(null);
		settingsPanelX.setBackground(Color.WHITE);
		
		settingsXGeneralLabel = new JLabel("General");
		settingsXGeneralLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		settingsXGeneralLabel.setBounds(10, 11, 109, 14);
		settingsPanelX.add(settingsXGeneralLabel);
		
		settingsXAboutButton = new JButton("About\r\n");
		settingsXAboutButton.setHorizontalAlignment(SwingConstants.LEFT);
		settingsXAboutButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		settingsXAboutButton.setBounds(10, 35, 248, 40);
		settingsPanelX.add(settingsXAboutButton);
		
		settingsXContactUsButton = new JButton("Contact Us\r\n");
		settingsXContactUsButton.setHorizontalAlignment(SwingConstants.LEFT);
		settingsXContactUsButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		settingsXContactUsButton.setBounds(261, 35, 248, 40);
		settingsPanelX.add(settingsXContactUsButton);
		
		settingsXLanguageButton = new JButton("Language");
		settingsXLanguageButton.setHorizontalAlignment(SwingConstants.LEFT);
		settingsXLanguageButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		settingsXLanguageButton.setBounds(10, 86, 248, 40);
		settingsPanelX.add(settingsXLanguageButton);
		
		settingsXManageLabel = new JLabel("Manage");
		settingsXManageLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		settingsXManageLabel.setBounds(10, 137, 109, 14);
		settingsPanelX.add(settingsXManageLabel);
		
		settingsXManageDevicesButton = new JButton("Add or Remove Devices");
		settingsXManageDevicesButton.setHorizontalAlignment(SwingConstants.LEFT);
		settingsXManageDevicesButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		settingsXManageDevicesButton.setBounds(10, 162, 248, 40);
		settingsPanelX.add(settingsXManageDevicesButton);
		
		GroupLayout gl_settingsPanel = new GroupLayout(settingsPanel);
		gl_settingsPanel.setHorizontalGroup(
			gl_settingsPanel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGroup(gl_settingsPanel.createSequentialGroup()
					.addGap(32)
					.addComponent(settingsPanelX, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
					.addGap(33))
		);
		gl_settingsPanel.setVerticalGroup(
			gl_settingsPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGroup(gl_settingsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(settingsPanelX, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
					.addContainerGap())
		);
		settingsPanel.setLayout(gl_settingsPanel);
		
		big4Panels.add(settingsPanel, "name_752159748087888");
	}
}
