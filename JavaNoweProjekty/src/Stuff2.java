import java.util.Scanner;


public class Stuff2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 20;
		
		int s[] = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Input 5 numbers between 1-30");
		int number = 1;
		for(int i = 0;i<5;i++){
			
			number = input.nextInt();
			if(number>=1&&number<=30){
				s[i] = number;
						
			}else{
				System.out.println("Wrong number, enter again");
				i--;
				
			}}
			
			for(int i = 0; i<5;i++){
				
				System.out.print(s[i] + " = ");
				for(int j = 0;j<s[i];j++){
					System.out.print("*");
				}
				System.out.println();
			}
		
		
		//for(int i = 1 ; i<=20;i++){
		//	
		//	System.out.println("Factorial : "+i+" = "+factorial(i));
	//	}
		
	}
	public static long factorial(int n){
		if(n<=1){
			return 1;
		}else{
			return n*factorial(n - 1);
		}
	}

}
