package windowBuilder.view;

import windowBuilder.common.GetTime;
import windowBuilder.common.GetWeather;

import windowBuilder.view.TabButtonsPanel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.Component;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.Insets;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import net.miginfocom.swing.MigLayout;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.border.SoftBevelBorder;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.Action;

@SuppressWarnings({ "unused", "serial" })
public class MainGUI_ActionListeners extends JFrame {
	public JPanel allMainMenuPanel;
	
	TabButtonsPanel TabButtonsPanelZ = new TabButtonsPanel();
	MoreSettingsPanel MoreSettingsPanelZ = new MoreSettingsPanel();
	MoreRoomsPanel MoreRoomsPanelZ = new MoreRoomsPanel();
	MoreLightsPanel MoreLightsPanelZ = new MoreLightsPanel();
	Big4Panel Big4PanelZ = new Big4Panel();
	
	//creates the frame
	public MainGUI_ActionListeners() {
		setClock();
		setTemperature();
		
		initializeFrame();
		
		createBig4PanelSwitchingEvents();
		createSettingsPanelSwitchingEvents();
		createRoomsSwitchingEvents();
		createControlSwitchingEvents();
		createLightsControlSwitchingEvents();
	}

	//shows the GUI
	public static void startGUI() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI_ActionListeners frame = new MainGUI_ActionListeners();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setClock() {
		GetTime clockClass = new GetTime();
		
		Thread clock = new Thread() {
			public void run() {
				try {
					while(true) {
						Big4PanelZ.defaultMenuClockLabel.setText(String.format("%02d",clockClass.getHour()) + ":" + String.format("%02d",clockClass.getMinute()));
						sleep(500);
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		};
		clock.start();
	}
	
	public void setTemperature() {
		GetWeather weatherClass = new GetWeather();
		
		Thread temperature = new Thread() {
			public void run() {
				try {
					while(true) {
						int temp = (int)weatherClass.getTemperature();
						Big4PanelZ.defaultMenuTemperatureLabel.setText(temp + "°C");
						System.out.println("API is being updated");
						Thread.sleep(30*60*1000);
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		};
		temperature.start();
	}
	
	private void createBig4PanelSwitchingEvents() {
		
		TabButtonsPanelZ.tabMenuButton.addActionListener(new ActionListener() { //saturday
			public void actionPerformed(ActionEvent e) {
				Big4PanelZ.big4Panels.setVisible(true);
				Big4PanelZ.defaultMenuPanel.setVisible(true);
				Big4PanelZ.roomsPanel.setVisible(false);
				Big4PanelZ.controlPanel.setVisible(false);
				Big4PanelZ.settingsPanel.setVisible(false);
				
				MoreSettingsPanelZ.moreSettingsPanel.setVisible(false);
				MoreLightsPanelZ.moreLightsPanel.setVisible(false);
				MoreRoomsPanelZ.moreRoomsPanel.setVisible(false);
			}
		});
		
		TabButtonsPanelZ.tabRoomsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Big4PanelZ.big4Panels.setVisible(true);
				Big4PanelZ.defaultMenuPanel.setVisible(false);
				Big4PanelZ.roomsPanel.setVisible(true);
				Big4PanelZ.controlPanel.setVisible(false);
				Big4PanelZ.settingsPanel.setVisible(false);
				
				MoreSettingsPanelZ.moreSettingsPanel.setVisible(false);
				MoreLightsPanelZ.moreLightsPanel.setVisible(false);
				MoreRoomsPanelZ.moreRoomsPanel.setVisible(false);
			}
		});
		
		TabButtonsPanelZ.tabControlButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Big4PanelZ.big4Panels.setVisible(true);
				Big4PanelZ.defaultMenuPanel.setVisible(false);
				Big4PanelZ.roomsPanel.setVisible(false);
				Big4PanelZ.controlPanel.setVisible(true);
				Big4PanelZ.settingsPanel.setVisible(false);
				
				MoreSettingsPanelZ.moreSettingsPanel.setVisible(false);
				MoreLightsPanelZ.moreLightsPanel.setVisible(false);
				MoreRoomsPanelZ.moreRoomsPanel.setVisible(false);
			}
		});
		
		TabButtonsPanelZ.tabSettingsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Big4PanelZ.big4Panels.setVisible(true);
				Big4PanelZ.defaultMenuPanel.setVisible(false);
				Big4PanelZ.roomsPanel.setVisible(false);
				Big4PanelZ.controlPanel.setVisible(false);
				Big4PanelZ.settingsPanel.setVisible(true);
				
				MoreSettingsPanelZ.moreSettingsPanel.setVisible(false);
				MoreLightsPanelZ.moreLightsPanel.setVisible(false);
				MoreRoomsPanelZ.moreRoomsPanel.setVisible(false);
			}
		});
	}
	
	
	private void createSettingsPanelSwitchingEvents() {
		Big4PanelZ.settingsXAboutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Big4PanelZ.big4Panels.setVisible(false);
				
				MoreSettingsPanelZ.moreSettingsPanel.setVisible(true);
				MoreSettingsPanelZ.aboutPanel.setVisible(true);
				MoreSettingsPanelZ.contactUsPanel.setVisible(false);
				MoreSettingsPanelZ.selectLanguagePanel.setVisible(false);
				MoreSettingsPanelZ.manageDevicesPanel.setVisible(false);
				
				MoreLightsPanelZ.moreLightsPanel.setVisible(false);
				MoreRoomsPanelZ.moreRoomsPanel.setVisible(false);
			}
		});
		
		Big4PanelZ.settingsXContactUsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Big4PanelZ.big4Panels.setVisible(false);
				
				MoreSettingsPanelZ.moreSettingsPanel.setVisible(true);
				MoreSettingsPanelZ.aboutPanel.setVisible(false);
				MoreSettingsPanelZ.contactUsPanel.setVisible(true);
				MoreSettingsPanelZ.selectLanguagePanel.setVisible(false);
				MoreSettingsPanelZ.manageDevicesPanel.setVisible(false);
				
				MoreLightsPanelZ.moreLightsPanel.setVisible(false);
				MoreRoomsPanelZ.moreRoomsPanel.setVisible(false);
			}
		});
		
		Big4PanelZ.settingsXLanguageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Big4PanelZ.big4Panels.setVisible(false);
				
				MoreSettingsPanelZ.moreSettingsPanel.setVisible(true);
				MoreSettingsPanelZ.aboutPanel.setVisible(false);
				MoreSettingsPanelZ.contactUsPanel.setVisible(false);
				MoreSettingsPanelZ.selectLanguagePanel.setVisible(true);
				MoreSettingsPanelZ.manageDevicesPanel.setVisible(false);
				
				MoreLightsPanelZ.moreLightsPanel.setVisible(false);
				MoreRoomsPanelZ.moreRoomsPanel.setVisible(false);
			}
		});
		
		Big4PanelZ.settingsXManageDevicesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Big4PanelZ.big4Panels.setVisible(false);
				
				MoreSettingsPanelZ.moreSettingsPanel.setVisible(true);
				MoreSettingsPanelZ.aboutPanel.setVisible(false);
				MoreSettingsPanelZ.contactUsPanel.setVisible(false);
				MoreSettingsPanelZ.selectLanguagePanel.setVisible(false);
				MoreSettingsPanelZ.manageDevicesPanel.setVisible(true);
				
				MoreLightsPanelZ.moreLightsPanel.setVisible(false);
				MoreRoomsPanelZ.moreRoomsPanel.setVisible(false);
			}
		});
	}
	
	private void createRoomsSwitchingEvents() {
		Big4PanelZ.roomsXLivingRoomButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Big4PanelZ.big4Panels.setVisible(false);
				MoreSettingsPanelZ.moreSettingsPanel.setVisible(false);
				MoreLightsPanelZ.moreLightsPanel.setVisible(false);
				
				MoreRoomsPanelZ.moreRoomsPanel.setVisible(true);
				MoreRoomsPanelZ.livingroomRoomsPanel.setVisible(true);
				MoreRoomsPanelZ.bedroomRoomsPanel.setVisible(false);
				MoreRoomsPanelZ.kitchenRoomsPanel.setVisible(false);
				MoreRoomsPanelZ.maintoiletRoomsPanel.setVisible(false);
			}
		});
		
		Big4PanelZ.roomsXBedroomButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Big4PanelZ.big4Panels.setVisible(false);
				MoreSettingsPanelZ.moreSettingsPanel.setVisible(false);
				MoreLightsPanelZ.moreLightsPanel.setVisible(false);
				
				MoreRoomsPanelZ.moreRoomsPanel.setVisible(true);
				MoreRoomsPanelZ.livingroomRoomsPanel.setVisible(false);
				MoreRoomsPanelZ.bedroomRoomsPanel.setVisible(true);
				MoreRoomsPanelZ.kitchenRoomsPanel.setVisible(false);
				MoreRoomsPanelZ.maintoiletRoomsPanel.setVisible(false);
			}
		});
		
		Big4PanelZ.roomsXKitchenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Big4PanelZ.big4Panels.setVisible(false);
				MoreSettingsPanelZ.moreSettingsPanel.setVisible(false);
				MoreLightsPanelZ.moreLightsPanel.setVisible(false);
				
				MoreRoomsPanelZ.moreRoomsPanel.setVisible(true);
				MoreRoomsPanelZ.livingroomRoomsPanel.setVisible(false);
				MoreRoomsPanelZ.bedroomRoomsPanel.setVisible(false);
				MoreRoomsPanelZ.kitchenRoomsPanel.setVisible(true);
				MoreRoomsPanelZ.maintoiletRoomsPanel.setVisible(false);
			}
		});
		
		Big4PanelZ.roomsXMainToiletButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Big4PanelZ.big4Panels.setVisible(false);
				MoreSettingsPanelZ.moreSettingsPanel.setVisible(false);
				MoreLightsPanelZ.moreLightsPanel.setVisible(false);
				
				MoreRoomsPanelZ.moreRoomsPanel.setVisible(true);
				MoreRoomsPanelZ.livingroomRoomsPanel.setVisible(false);
				MoreRoomsPanelZ.bedroomRoomsPanel.setVisible(false);
				MoreRoomsPanelZ.kitchenRoomsPanel.setVisible(false);
				MoreRoomsPanelZ.maintoiletRoomsPanel.setVisible(true);
			}
		});
	}
	
	private void createControlSwitchingEvents() {
		Big4PanelZ.controlXLightsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Big4PanelZ.big4Panels.setVisible(false);
				MoreSettingsPanelZ.moreSettingsPanel.setVisible(false);
				MoreRoomsPanelZ.moreRoomsPanel.setVisible(false);
				
				MoreLightsPanelZ.moreLightsPanel.setVisible(true);
				MoreLightsPanelZ.allLightsControlPanel.setVisible(true);
				MoreLightsPanelZ.dynamicLightsControlPanel.setVisible(false);
			}
		});
	}
	
	private void createLightsControlSwitchingEvents() {
		MoreLightsPanelZ.allLightsControlXLivingRoomFrontButton.addActionListener(new displayPanelActionListener());
		MoreLightsPanelZ.allLightsControlXLivingRoomBackButton.addActionListener(new displayPanelActionListener());
		MoreLightsPanelZ.allLightsControlXMainToiletButton.addActionListener(new displayPanelActionListener());
		MoreLightsPanelZ.allLightsControlXBedroomButton.addActionListener(new displayPanelActionListener());
		MoreLightsPanelZ.allLightsControlXKitchenButton.addActionListener(new displayPanelActionListener());
		MoreLightsPanelZ.allLightsControlXDiningTableButton.addActionListener(new displayPanelActionListener());
		MoreLightsPanelZ.allLightsControlXOfficeButton.addActionListener(new displayPanelActionListener());
		
		MoreLightsPanelZ.dynamicLightsControlXOnOffButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (MoreLightsPanelZ.dynamicLightsControlXOnOffButton.isSelected()) {
					MoreLightsPanelZ.dynamicLightsControlXOnOffButton.setText("On");
				} else {
					MoreLightsPanelZ.dynamicLightsControlXOnOffButton.setText("Off");
				}
			}
		});
	}
	
	private class displayPanelActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String functionName = e.getActionCommand();
			MoreLightsPanelZ.dynamicLightsControlXXXXLightsLabel.setText(functionName);
			
			Big4PanelZ.big4Panels.setVisible(false);
			MoreSettingsPanelZ.moreSettingsPanel.setVisible(false);
			MoreRoomsPanelZ.moreRoomsPanel.setVisible(false);
			MoreLightsPanelZ.moreLightsPanel.setVisible(true);
			
			MoreLightsPanelZ.allLightsControlPanel.setVisible(false);
			MoreLightsPanelZ.dynamicLightsControlPanel.setVisible(true);
		}
	}
	
	private void initializeFrame() {
		setTitle("Smart Living Hall V0.36");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/SmartHomeIconRed.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 390);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		setResizable(false);
		
		allMainMenuPanel = new JPanel();
		allMainMenuPanel.setBackground(Color.BLACK);
		allMainMenuPanel.setBounds(0, 0, 584, 315);
		allMainMenuPanel.setLayout(new CardLayout(0, 0));
		
		allMainMenuPanel.add(Big4PanelZ.big4Panels, "name_751494363624063");
		allMainMenuPanel.add(MoreRoomsPanelZ.moreRoomsPanel, "name_751237036234552");
		allMainMenuPanel.add(MoreLightsPanelZ.moreLightsPanel, "name_750525030528903");
		allMainMenuPanel.add(MoreSettingsPanelZ.moreSettingsPanel, "name_749679911895594");
		
		getContentPane().add(allMainMenuPanel);
		getContentPane().add(TabButtonsPanelZ.tabButtonsPanel);
	}
}
