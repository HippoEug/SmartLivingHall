package windowBuilder.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

public class MoreSettingsPanel extends JPanel{
	private static final long serialVersionUID = 1L;

	public JPanel moreSettingsPanel;
	
	public JPanel aboutPanel;
	
	public JPanel contactUsPanel;
	public JLabel contactUsXContactUsLabel;
	public JLabel contactUsXNameLabel;
	public JLabel contactUsXEmailLabel;
	public JLabel contactUsXContactNoLabel;
	public JLabel contactUsXMessageLabel;
	public JButton contactUsXSubmitButton;
	public JTextField contactUsXContactNoTextField;
	public JTextField contactUsXEmailTextField;
	public JTextField contactUsXNameTextField;
	public JScrollPane contactUsXMessageScrollPane;
	public JTextArea contactUsXMessageTextArea;
	
	public JPanel selectLanguagePanel;
	
	public JPanel manageDevicesPanel;
	public JLabel manageDevicesXAddRemoveDevicesLabel;
	public JLabel manageDevicesXDeviceNameLabel;
	public JLabel manageDevicesXPortLabel;
	public JButton manageDevicesXAddButton;
	public JLabel manageDevicesXCategoryLabel;
	
	public JTextField manageDevicesXDeviceNameTextField;
	public JTextField manageDevicesXPortTextField;
	public JTextField manageDevicesXCategoryTextField;
	
	public MoreSettingsPanel() {
		moreSettingsPanel = new JPanel();
		moreSettingsPanel.setLayout(new CardLayout(0, 0));
		
		//ABOUT PANEL ONLY
		aboutPanel = new JPanel();
		aboutPanel.setBackground(Color.WHITE);
		moreSettingsPanel.add(aboutPanel, "name_749718764248925");
		JPanel aboutPanelX = new JPanel();
		aboutPanelX.setLayout(null);
		aboutPanelX.setBackground(Color.WHITE);
		
		JLabel aboutXAboutLabel = new JLabel("About");
		aboutXAboutLabel.setHorizontalAlignment(SwingConstants.LEFT);
		aboutXAboutLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		aboutXAboutLabel.setBounds(10, 11, 109, 14);
		aboutPanelX.add(aboutXAboutLabel);
		
		JScrollPane aboutXScrollPane = new JScrollPane();
		aboutXScrollPane.setBounds(10, 40, 499, 242);
		aboutPanelX.add(aboutXScrollPane);
		
		JTextArea aboutXAboutTextArea = new JTextArea();
		aboutXAboutTextArea.setWrapStyleWord(true);
		aboutXAboutTextArea.setText("SMART LIVING HALL (V0.2)\r\n\r\nIMPORTANT: BY USING THIS SOFTWARE, YOU ARE AGREEING TO BE BOUND BY THE FOLLOWING TERMS: \r\n\r\nSmart Living Hall LICENSE AGREEMENT\r\nSingle Use License\r\n\r\n1. General\r\nThe software (including embedded software and third party software), documentation, interfaces, content, fonts and any data (resources) that came downloaded, as may be updated or replaced by featyre enhancements, software updates provided by Smart Living Hall are licensed, not sold. for use only under the terms of this License. Smart Living Hall and its licensors retain ownership of the software itself and reserve all rights not expressively granted to you.\r\n");
		aboutXAboutTextArea.setLineWrap(true);
		aboutXAboutTextArea.setEnabled(false);
		aboutXAboutTextArea.setEditable(false);
		aboutXAboutTextArea.setCaretPosition(0);
		aboutXScrollPane.setViewportView(aboutXAboutTextArea);
		
		GroupLayout gl_aboutPanel = new GroupLayout(aboutPanel);
		gl_aboutPanel.setHorizontalGroup(
			gl_aboutPanel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGroup(gl_aboutPanel.createSequentialGroup()
					.addGap(32)
					.addComponent(aboutPanelX, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
					.addGap(33))
		);
		gl_aboutPanel.setVerticalGroup(
			gl_aboutPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGroup(gl_aboutPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(aboutPanelX, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
					.addContainerGap())
		);
		aboutPanel.setLayout(gl_aboutPanel);
		
		
		//CONTACT US PANEL ONLY
		contactUsPanel = new JPanel();
		contactUsPanel.setBackground(Color.WHITE);
		moreSettingsPanel.add(contactUsPanel, "name_749729951075902");
		JPanel contactUsPanelX = new JPanel();
		contactUsPanelX.setLayout(null);
		contactUsPanelX.setBackground(Color.WHITE);
		
		contactUsXContactUsLabel = new JLabel("Contact Us");
		contactUsXContactUsLabel.setHorizontalAlignment(SwingConstants.LEFT);
		contactUsXContactUsLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contactUsXContactUsLabel.setBounds(10, 11, 109, 14);
		contactUsPanelX.add(contactUsXContactUsLabel);
		
		contactUsXNameLabel = new JLabel("Name*:");
		contactUsXNameLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		contactUsXNameLabel.setBounds(10, 36, 90, 14);
		contactUsPanelX.add(contactUsXNameLabel);
		
		contactUsXNameTextField = new JTextField();
		contactUsXNameTextField.setColumns(10);
		contactUsXNameTextField.setBounds(110, 35, 199, 20);
		contactUsPanelX.add(contactUsXNameTextField);
		
		contactUsXEmailLabel = new JLabel("Email*: ");
		contactUsXEmailLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		contactUsXEmailLabel.setBounds(10, 61, 90, 14);
		contactUsPanelX.add(contactUsXEmailLabel);
		
		contactUsXEmailTextField = new JTextField();
		contactUsXEmailTextField.setColumns(10);
		contactUsXEmailTextField.setBounds(110, 60, 199, 20);
		contactUsPanelX.add(contactUsXEmailTextField);
		
		contactUsXContactNoLabel = new JLabel("Contact No.:");
		contactUsXContactNoLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		contactUsXContactNoLabel.setBounds(10, 86, 90, 14);
		contactUsPanelX.add(contactUsXContactNoLabel);
		
		contactUsXContactNoTextField = new JTextField();
		contactUsXContactNoTextField.setColumns(10);
		contactUsXContactNoTextField.setBounds(110, 85, 199, 20);
		contactUsPanelX.add(contactUsXContactNoTextField);
		
		contactUsXMessageLabel = new JLabel("Message:");
		contactUsXMessageLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		contactUsXMessageLabel.setBounds(10, 111, 90, 14);
		contactUsPanelX.add(contactUsXMessageLabel);
		
		contactUsXSubmitButton = new JButton("Submit");
		contactUsXSubmitButton.setBounds(190, 252, 139, 30);
		contactUsPanelX.add(contactUsXSubmitButton);
		GroupLayout gl_contactUsPanel = new GroupLayout(contactUsPanel);
		gl_contactUsPanel.setHorizontalGroup(
			gl_contactUsPanel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGroup(gl_contactUsPanel.createSequentialGroup()
					.addGap(32)
					.addComponent(contactUsPanelX, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
					.addGap(33))
		);
		gl_contactUsPanel.setVerticalGroup(
			gl_contactUsPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGroup(gl_contactUsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(contactUsPanelX, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		contactUsXMessageScrollPane = new JScrollPane();
		contactUsXMessageScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contactUsXMessageScrollPane.setBounds(10, 136, 499, 106);
		contactUsPanelX.add(contactUsXMessageScrollPane);
		
		contactUsXMessageTextArea = new JTextArea();
		contactUsXMessageScrollPane.setViewportView(contactUsXMessageTextArea);
		contactUsPanel.setLayout(gl_contactUsPanel);
		
		
		//SELECT LANGUAGE PANEL ONLY
		selectLanguagePanel = new JPanel();
		selectLanguagePanel.setBackground(Color.WHITE);
		moreSettingsPanel.add(selectLanguagePanel, "name_749744345635371");
		JPanel selectLanguagePanelX = new JPanel();
		selectLanguagePanelX.setLayout(null);
		selectLanguagePanelX.setBackground(Color.WHITE);
		
		JLabel selectLanguageXLanguageLabel = new JLabel("Language");
		selectLanguageXLanguageLabel.setHorizontalAlignment(SwingConstants.LEFT);
		selectLanguageXLanguageLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		selectLanguageXLanguageLabel.setBounds(10, 11, 109, 14);
		selectLanguagePanelX.add(selectLanguageXLanguageLabel);
		
		JButton selectLanguageXEnglishButton = new JButton("English");
		selectLanguageXEnglishButton.setHorizontalAlignment(SwingConstants.LEFT);
		selectLanguageXEnglishButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		selectLanguageXEnglishButton.setBounds(10, 36, 499, 40);
		selectLanguagePanelX.add(selectLanguageXEnglishButton);
		GroupLayout gl_selectLanguagePanel = new GroupLayout(selectLanguagePanel);
		gl_selectLanguagePanel.setHorizontalGroup(
			gl_selectLanguagePanel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGroup(gl_selectLanguagePanel.createSequentialGroup()
					.addGap(32)
					.addComponent(selectLanguagePanelX, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
					.addGap(33))
		);
		gl_selectLanguagePanel.setVerticalGroup(
			gl_selectLanguagePanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGroup(gl_selectLanguagePanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(selectLanguagePanelX, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
					.addContainerGap())
		);
		selectLanguagePanel.setLayout(gl_selectLanguagePanel);
		
		
		//ADD REMOVE DEVICES PANEL ONLY
		manageDevicesPanel = new JPanel();
		manageDevicesPanel.setBackground(Color.WHITE);
		moreSettingsPanel.add(manageDevicesPanel, "name_750453217709779");
		JPanel manageDevicesPanelX = new JPanel();
		manageDevicesPanelX.setLayout(null);
		manageDevicesPanelX.setBackground(Color.WHITE);
		
		manageDevicesXAddRemoveDevicesLabel = new JLabel("Add or Remove Devices");
		manageDevicesXAddRemoveDevicesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		manageDevicesXAddRemoveDevicesLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		manageDevicesXAddRemoveDevicesLabel.setBounds(10, 11, 212, 14);
		manageDevicesPanelX.add(manageDevicesXAddRemoveDevicesLabel);
		
		manageDevicesXDeviceNameLabel = new JLabel("Device Name:");
		manageDevicesXDeviceNameLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		manageDevicesXDeviceNameLabel.setBounds(10, 37, 100, 14);
		manageDevicesPanelX.add(manageDevicesXDeviceNameLabel);
		
		manageDevicesXDeviceNameTextField = new JTextField();
		manageDevicesXDeviceNameTextField.setColumns(10);
		manageDevicesXDeviceNameTextField.setBounds(111, 36, 199, 20);
		manageDevicesPanelX.add(manageDevicesXDeviceNameTextField);
		
		manageDevicesXPortLabel = new JLabel("Port:");
		manageDevicesXPortLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		manageDevicesXPortLabel.setBounds(10, 63, 39, 14);
		manageDevicesPanelX.add(manageDevicesXPortLabel);
		
		manageDevicesXPortTextField = new JTextField();
		manageDevicesXPortTextField.setColumns(10);
		manageDevicesXPortTextField.setBounds(111, 62, 199, 20);
		manageDevicesPanelX.add(manageDevicesXPortTextField);
		
		manageDevicesXCategoryLabel = new JLabel("Category");
		manageDevicesXCategoryLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		manageDevicesXCategoryLabel.setBounds(10, 89, 100, 14);
		manageDevicesPanelX.add(manageDevicesXCategoryLabel);
		
		manageDevicesXCategoryTextField = new JTextField();
		manageDevicesXCategoryTextField.setColumns(10);
		manageDevicesXCategoryTextField.setBounds(111, 88, 199, 20);
		manageDevicesPanelX.add(manageDevicesXCategoryTextField);
		
		GroupLayout gl_manageDevicesPanel = new GroupLayout(manageDevicesPanel);
		gl_manageDevicesPanel.setHorizontalGroup(
			gl_manageDevicesPanel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGap(0, 584, Short.MAX_VALUE)
				.addGroup(gl_manageDevicesPanel.createSequentialGroup()
					.addGap(32)
					.addComponent(manageDevicesPanelX, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
					.addGap(33))
		);
		gl_manageDevicesPanel.setVerticalGroup(
			gl_manageDevicesPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGap(0, 315, Short.MAX_VALUE)
				.addGroup(gl_manageDevicesPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(manageDevicesPanelX, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		manageDevicesXAddButton = new JButton("Add");
		manageDevicesXAddButton.setBounds(191, 252, 139, 30);
		manageDevicesPanelX.add(manageDevicesXAddButton);
		manageDevicesPanel.setLayout(gl_manageDevicesPanel);
	}
}
