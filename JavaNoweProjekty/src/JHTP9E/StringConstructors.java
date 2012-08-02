package JHTP9E;

public class StringConstructors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	String s1 = "hello there";
	char charArray[] = new char[5];

	System.out.println("Lenght of string 1: "+s1.length());
	System.out.println("String reversed is :");
	
		for(int i = s1.length()-1; i>=0; i--){
			System.out.printf("%c ",s1.charAt(i));
		}
		System.out.println("");
		s1.getChars(0, 5, charArray, 0);
		
		for(char c : charArray){
			System.out.printf("%c ",c);
		}
		
	}

}
