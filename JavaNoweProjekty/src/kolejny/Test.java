package kolejny;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.Button;
import java.io.File;
import java.io.IOException;

public class Test extends JFrame {

	private JPanel contentPane;
	private JTextArea textField;
	private JTextArea textField_1;
	private JTextArea textField_2;
	private JButton btnCipher;
	private JButton btnDecipher;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmSelectFile;
	private JMenuItem mntmExit;
	private JTextField textField_3;
	private JLabel lblSelectedFile;
	private JLabel lblNewLabel;
	private JTextField textField_4;
	private String cipherText;
	private String decipherText;
	private Cipher cipher;
	private int key;
	private JLabel lblNewLabel_1;
	private JTextField textField_5;
	private JFileChooser fileChooser;
	private JButton btnSaveTo;
	private JButton btnOpen;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Test() {
		
		setTitle("Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 576);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmSelectFile = new JMenuItem("Select file");
		mnFile.add(mntmSelectFile);
		
		mntmExit = new JMenuItem("EXIT");
		mnFile.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField = new JTextArea();
		textField.setColumns(10);
		
		textField_1 = new JTextArea();
		textField_1.setColumns(10);
		
		textField_2 = new JTextArea();
		textField_2.setColumns(10);
		
		JLabel lblInputTextTo = new JLabel("Input text to cipher:");
		
		JLabel lblInputTextTo_1 = new JLabel("Input text to decipher");
		
		JLabel lblPlainText = new JLabel("Plain text:");
		
		btnCipher = new JButton("Cipher");
		
		
		btnDecipher = new JButton("Decipher");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		lblSelectedFile = new JLabel("Key");
		
		lblNewLabel = new JLabel("Selected output");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Selected input file");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		btnSaveTo = new JButton("Save to");
	
		
		btnOpen = new JButton("open");
	
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(57)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPlainText)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnCipher)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnDecipher))
								.addComponent(lblInputTextTo_1)
								.addComponent(lblInputTextTo)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
								.addComponent(textField_1)
								.addComponent(textField_2))
							.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSelectedFile)
								.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
								.addComponent(textField_4))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSaveTo)
						.addComponent(btnOpen))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblInputTextTo)
						.addComponent(lblSelectedFile))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblInputTextTo_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSaveTo))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(3)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnOpen))))
					.addGap(20)
					.addComponent(lblPlainText)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCipher)
						.addComponent(btnDecipher))
					.addContainerGap(88, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	
		createEvents();
	}

		
	private void createEvents(){
		btnCipher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cipher = new Cipher();
				
				cipherText = textField.getText().toString();
				key = Integer.valueOf(textField_3.getText().toString());
				cipherText  = cipher.cipherText(cipherText, key);
				textField_2.setText(cipherText);
			}
		});
		btnDecipher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cipher = new Cipher();
				
				decipherText = textField_1.getText().toString();
				key = Integer.valueOf(textField_3.getText().toString());
				decipherText = cipher.decipherText(decipherText, key);
				textField_2.setText(decipherText);
			}
		});
		btnSaveTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fileName = null;
				int returnValue;
				
				fileChooser = new JFileChooser();
				returnValue = fileChooser.showSaveDialog(Test.this);
				if(returnValue == JFileChooser.APPROVE_OPTION){
					File file = fileChooser.getSelectedFile();
					fileName = file.getPath();
				}
				
				
				cipher = new Cipher();
				
				cipherText = textField.getText().toString();
				key = Integer.valueOf(textField_3.getText().toString());
				cipherText  = cipher.cipherText(cipherText, key);
				cipher.encyptFile(fileName, cipherText);
				textField_4.setText(fileName);
			}
		});
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fileName = "";
				int returnValue;
				
				fileChooser = new JFileChooser();
				returnValue = fileChooser.showOpenDialog(Test.this);
				if(returnValue == JFileChooser.APPROVE_OPTION){
					File file = fileChooser.getSelectedFile();
					fileName = file.getPath();
				}
				
				String after;
				cipher = new Cipher();
				
				
				key = Integer.valueOf(textField_3.getText().toString());
				
				after = cipher.decryptFile(fileName,key);
				textField_5.setText(fileName);
				textField_2.setText(after);
			}
		});
	}
}
