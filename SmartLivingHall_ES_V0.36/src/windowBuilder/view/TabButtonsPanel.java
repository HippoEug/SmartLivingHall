package windowBuilder.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class TabButtonsPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	public JButton tabMenuButton;
	public JButton tabRoomsButton;
	public JButton tabControlButton;
	public JButton tabSettingsButton;
	public JPanel tabButtonsPanel;
	
	public TabButtonsPanel() {
		tabButtonsPanel = new JPanel();
		tabButtonsPanel.setBackground(Color.WHITE);
		tabButtonsPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabButtonsPanel.setBounds(0, 315, 584, 46);
		tabButtonsPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		tabMenuButton = new JButton("MENU");
		tabMenuButton.setBackground(Color.WHITE);
		tabMenuButton.setOpaque(true);
		tabMenuButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/MenuIcon.png")));
		tabMenuButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		tabButtonsPanel.add(tabMenuButton);
		
		tabRoomsButton = new JButton("ROOMS");
		tabRoomsButton.setBackground(Color.WHITE);
		tabRoomsButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/open-exit-door.png")));
		tabRoomsButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		tabButtonsPanel.add(tabRoomsButton);
		
		tabControlButton = new JButton("CONTROL");
		tabControlButton.setBackground(Color.WHITE);
		tabControlButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/controls.png")));
		tabControlButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		tabButtonsPanel.add(tabControlButton);
		
		tabSettingsButton = new JButton("SETTINGS");
		tabSettingsButton.setBackground(Color.WHITE);
		tabSettingsButton.setIcon(new ImageIcon(MainGUI_ActionListeners.class.getResource("/windowBuilder/resources/settings-gears.png")));
		tabSettingsButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		tabButtonsPanel.add(tabSettingsButton);
		
		tabMenuButton.setFocusable(false);
		tabRoomsButton.setFocusable(false);
		tabControlButton.setFocusable(false);
		tabSettingsButton.setFocusable(false);
	}
}
