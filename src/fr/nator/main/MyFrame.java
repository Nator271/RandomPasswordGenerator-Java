package fr.nator.main;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.*;


public class MyFrame extends JFrame implements ActionListener, KeyListener {
	

	private static final long serialVersionUID = -3685901208572806031L;
	
	JButton buttonGenerate;
	JCheckBox checkBoxMinuscule;
	JCheckBox checkBoxMajuscule;
	JCheckBox checkBoxChiffre;
	JCheckBox checkBoxSpecial;
	JTextField textField;
	JPanel passwordGeneratedPanel;
	JTextArea password;
	JLayeredPane layeredPane;
	JScrollPane scroll;
	ArrayList<Integer> keylist = new ArrayList<Integer>();
	
	int[] keytab = {KeyEvent.VK_NUMPAD0, KeyEvent.VK_NUMPAD1, KeyEvent.VK_NUMPAD2, KeyEvent.VK_NUMPAD3, KeyEvent.VK_NUMPAD4, KeyEvent.VK_NUMPAD5, KeyEvent.VK_NUMPAD6, KeyEvent.VK_NUMPAD7, KeyEvent.VK_NUMPAD8, KeyEvent.VK_NUMPAD9, KeyEvent.VK_0, KeyEvent.VK_1, KeyEvent.VK_2, KeyEvent.VK_3, KeyEvent.VK_4, KeyEvent.VK_5, KeyEvent.VK_6, KeyEvent.VK_7, KeyEvent.VK_8, KeyEvent.VK_9, KeyEvent.VK_RIGHT, KeyEvent.VK_LEFT, KeyEvent.VK_UP, KeyEvent.VK_DOWN, KeyEvent.VK_ENTER, KeyEvent.VK_BACK_SPACE, KeyEvent.VK_TAB, KeyEvent.VK_CANCEL, KeyEvent.VK_CLEAR, KeyEvent.VK_SHIFT, KeyEvent.VK_CONTROL, KeyEvent.VK_ALT, KeyEvent.VK_PAUSE, KeyEvent.VK_CAPS_LOCK, KeyEvent.VK_ESCAPE, KeyEvent.VK_PAGE_UP, KeyEvent.VK_PAGE_DOWN, KeyEvent.VK_END, KeyEvent.VK_HOME, KeyEvent.VK_NUM_LOCK, KeyEvent.VK_SCROLL_LOCK, KeyEvent.VK_F1, KeyEvent.VK_F2, KeyEvent.VK_F3, KeyEvent.VK_F4, KeyEvent.VK_F5, KeyEvent.VK_F6, KeyEvent.VK_F7, KeyEvent.VK_F8, KeyEvent.VK_F9, KeyEvent.VK_F10, KeyEvent.VK_F11, KeyEvent.VK_F12, KeyEvent.VK_F13, KeyEvent.VK_F14, KeyEvent.VK_F15, KeyEvent.VK_F16, KeyEvent.VK_F17, KeyEvent.VK_F18, KeyEvent.VK_F19, KeyEvent.VK_F20, KeyEvent.VK_F21, KeyEvent.VK_F22, KeyEvent.VK_F23, KeyEvent.VK_F24, KeyEvent.VK_PRINTSCREEN, KeyEvent.VK_INSERT, KeyEvent.VK_HELP, KeyEvent.VK_META, KeyEvent.VK_DELETE, KeyEvent.VK_KP_UP, KeyEvent.VK_KP_DOWN, KeyEvent.VK_KP_RIGHT, KeyEvent.VK_KP_LEFT, KeyEvent.VK_AGAIN, KeyEvent.VK_UNDO, KeyEvent.VK_COPY, KeyEvent.VK_PASTE, KeyEvent.VK_CUT, KeyEvent.VK_FIND, KeyEvent.VK_PROPS, KeyEvent.VK_STOP, KeyEvent.VK_COMPOSE, KeyEvent.VK_ALT_GRAPH};
	
	MyFrame(){
		
		for(int k : keytab) {
			keylist.add(k);
		}

		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 700, 800);
		
		
		JLabel backgroundLabel = new JLabel();
		ImageIcon background = new ImageIcon(getClass().getClassLoader().getResource("background.png"));

		backgroundLabel.setOpaque(true);
		backgroundLabel.setIcon(background);
		backgroundLabel.setBounds(-100, -10, 800, 800);
		
		JLabel logoLabel = new JLabel();
		ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("random-password-generator.png"));

		
		logoLabel.setOpaque(false);
		logoLabel.setIcon(logo);
		logoLabel.setBounds(185, -40, 300, 300);
		
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(40, 40));
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		textField.setForeground(Color.white);
		textField.setBackground(new Color(0x191970));
		textField.addKeyListener(this);
		textField.setCaretColor(Color.white);
		textField.setBounds(0, 0, 40, 0);
		
		JLabel numberLabel = new JLabel();
		numberLabel.setBounds(0, 0, 50, 0);
		numberLabel.setText("Number of character : ");
		numberLabel.setFont(new Font("Comic Sans MS",Font.PLAIN, 15));
		numberLabel.setForeground(Color.white);
		numberLabel.setOpaque(false);
		
		JPanel numberPanel = new JPanel();
		numberPanel.add(numberLabel);
		numberPanel.add(textField);
		numberPanel.setBounds(75, 255, 500, 50);
		numberPanel.setOpaque(false);
		
		
		ImageIcon xIcon = new ImageIcon(getClass().getClassLoader().getResource("remove.png"));
		ImageIcon checkIcon = new ImageIcon(getClass().getClassLoader().getResource("checkmark.png"));

		
		
		checkBoxMinuscule = new JCheckBox();
		checkBoxMinuscule.setText("Lowercase characters");
		checkBoxMinuscule.setFocusable(false);
		checkBoxMinuscule.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		checkBoxMinuscule.setForeground(Color.white);
		checkBoxMinuscule.setOpaque(false);
		checkBoxMinuscule.setIcon(xIcon);
		checkBoxMinuscule.setSelectedIcon(checkIcon);
		
		checkBoxMajuscule = new JCheckBox();
		checkBoxMajuscule.setText("Uppercase characters");
		checkBoxMajuscule.setFocusable(false);
		checkBoxMajuscule.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		checkBoxMajuscule.setForeground(Color.white);
		checkBoxMajuscule.setOpaque(false);
		checkBoxMajuscule.setIcon(xIcon);
		checkBoxMajuscule.setSelectedIcon(checkIcon);

		checkBoxChiffre = new JCheckBox();
		checkBoxChiffre.setText("Figures");
		checkBoxChiffre.setFocusable(false);
		checkBoxChiffre.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		checkBoxChiffre.setForeground(Color.white);
		checkBoxChiffre.setOpaque(false);
		checkBoxChiffre.setIcon(xIcon);
		checkBoxChiffre.setSelectedIcon(checkIcon);

		checkBoxSpecial = new JCheckBox();
		checkBoxSpecial.setText("Special characters");
		checkBoxSpecial.setFocusable(false);
		checkBoxSpecial.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		checkBoxSpecial.setForeground(Color.white);
		checkBoxSpecial.setOpaque(false);
		checkBoxSpecial.setIcon(xIcon);
		checkBoxSpecial.setSelectedIcon(checkIcon);
		
		JPanel checkBoxPanel = new JPanel();
		checkBoxPanel.add(checkBoxMinuscule);
		checkBoxPanel.add(checkBoxSpecial);
		checkBoxPanel.add(checkBoxMajuscule);
		checkBoxPanel.add(checkBoxChiffre);

		checkBoxPanel.setBounds(150, 325, 400, 150);
		checkBoxPanel.setOpaque(false);
		
		
		buttonGenerate = new JButton();
		buttonGenerate.addActionListener(this);
		buttonGenerate.setText("Generate");
		buttonGenerate.setBounds(260, 450, 150, 50);
		
		
		JLabel titlePassword = new JLabel("Password Generated : ");
		titlePassword.setOpaque(false);
		titlePassword.setForeground(Color.white);
		titlePassword.setFont(new Font("Georgia", Font.PLAIN, 14));
		titlePassword.setBounds(270, 500, 200, 60);
		
		password = new JTextArea();
		password.setOpaque(false);
		password.setForeground(Color.white);
		password.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		password.setLineWrap(true);
		
		scroll = new JScrollPane(password);
		scroll.setBounds(10, 550, 660, 200);
		scroll.getViewport().setOpaque(false);
		scroll.setOpaque(false);
		
		
		layeredPane.add(titlePassword, Integer.valueOf(1));
		layeredPane.add(scroll, Integer.valueOf(2));
		layeredPane.add(numberPanel, Integer.valueOf(1));
		layeredPane.add(buttonGenerate, Integer.valueOf(1));
		layeredPane.add(checkBoxPanel, Integer.valueOf(1));
		layeredPane.add(logoLabel , Integer.valueOf(1));
		layeredPane.add(backgroundLabel , Integer.valueOf(0));
		
		this.add(layeredPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(700, 800);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setVisible(true);
		
		
		

		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonGenerate) {
			if((checkBoxMinuscule.isSelected() || checkBoxMajuscule.isSelected() || checkBoxChiffre.isSelected() || checkBoxSpecial.isSelected()) && !(textField.getText().isEmpty())) {
				String passwordS = Main.generatingPassword(textField.getText(), checkBoxMinuscule.isSelected(), checkBoxMajuscule.isSelected(), checkBoxChiffre.isSelected(), checkBoxSpecial.isSelected());
				System.out.println(passwordS);
				password.setText(passwordS);
				scroll.add(password);
				scroll.setViewportView(password);
				
			}
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		if(!(keylist.contains(e.getKeyCode()))) {
			if(textField.getText().length() == 0) {
				textField.setText("");
			} else {
				try {
					textField.setText(textField.getText(0, textField.getText().length()-1));
				} catch (BadLocationException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {}

}
