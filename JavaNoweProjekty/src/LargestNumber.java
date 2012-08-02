import java.util.Scanner;


public class LargestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Input 10 numbers : ");
		int counter = 0;
		int number=0;//3  5
		int largest=0;//3 5
		int largest2=0;//03 5
		
		while(counter<3){
			number = input.nextInt();
			if(largest<number){
				largest2 = largest;
				largest = number;	
				
			}else if(largest2<number){
				largest2=number;
			}
			counter++;
		}
		System.out.println("Largest number "+largest +" "+largest2);
	}

}
	


