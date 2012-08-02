package kolejny;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Cipher {
	
	private String text;
	private String cipherText;
	private String DecipherText;
	
	public String getText() {
		return text;
	}
	public String getCipherText() {
		return cipherText;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setCipherText(String cipherText) {
		this.cipherText = cipherText;
	}
	
	public String cipherText(String textToCipher, int key){
		String result = "";
		key = key %26;
	for(int i = 0 ; i<textToCipher.length(); i++ ){
		int s;
		s =(int) textToCipher.charAt(i);
		char currChar = (char) (s + key);
		result = result +currChar;
	}
	return result;
	}
	public String decipherText(String textToDecipher, int key){
		String result = "";
		key = key %26;
	for(int i = 0 ; i<textToDecipher.length(); i++ ){
		int s;
		s =(int) textToDecipher.charAt(i);
		char currChar = (char) (s - key);
		result = result +currChar;
	}
	return result;

}
	public void encyptFile(String fileName, String msg){
		try {
			BufferedWriter bWrite = new BufferedWriter(new FileWriter(fileName));
			bWrite.write(msg);
			bWrite.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String decryptFile(String fileName,int key){
		String line = "Decrypted\n";
		String s = "";
			try {
				BufferedReader bRead = new BufferedReader(new FileReader(fileName));
				while((line = bRead.readLine()) != null){
				s = s + line;
					
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e){
				e.printStackTrace();
			}
			
			
		String t;
		t = decipherText(s, key);
		return t;
	}
}
