package JHTP9E;

import java.util.Scanner;

public class TokenTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


			String sentence;
			Scanner in = new Scanner(System.in);
			System.out.print("Entere the sentence: ");
			sentence = in.nextLine();
			
			String tab[] = sentence.split(" ");
			
			for(String s : tab){
				System.out.println(s);
			}
			System.out.println("test"+2+2);
	}

}
