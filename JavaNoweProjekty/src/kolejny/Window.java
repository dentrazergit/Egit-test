package kolejny;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame{
	
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	
	private JButton button;
	private String textToCipher;
	private String textToDecipher;
	private Cipher cipher;
	private int key;
	public Window(){
		
		super("Cipher");
		setLayout(new FlowLayout());
		label1 = new JLabel("Text to cipher:");
		textField1 = new JTextField(10);
		add(textField1);
		label2 = new JLabel("Text to decipher:");
		textField2 = new JTextField(10);
		add(textField2);
		label3 = new JLabel("Plain Text:");
		textField3 = new JTextField(10);
		add(textField3);
		textField4 = new JTextField(10);
		label4 = new JLabel("Key");
		add(textField4);
		button = new JButton();
		add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textToCipher = textField1.toString();
				key = Integer.valueOf(textField4.toString());
				textField3.setText(cipher.cipherText(textToCipher, key));
				
			}
		});
		
	}
}
