import java.util.ArrayList;
import java.util.Random;


public class RandomS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		Random randomNumber = new Random();
		
		n = 1 + randomNumber.nextInt(2);
		System.out.println("1<n<2 : "+n);
		n = 1 + randomNumber.nextInt(101);
		System.out.println("1<n<100 : "+n);
		n = 1 + randomNumber.nextInt(10);
		System.out.println("1<n<9 : "+n);
		n = 1000 + randomNumber.nextInt(112);
		System.out.println("1<n<1112 : "+n);
		n = -1 + randomNumber.nextInt(2);
		System.out.println("-1<n<1 : "+n);
		n = -3 + randomNumber.nextInt(15);
		System.out.println("-3<n<11 : "+n);
		n = 2 + 2* randomNumber.nextInt(5);
		System.out.println("2,4,6,8,10,12 : "+n);
		
		
		
		System.out.println("sd "+integerPower(2,6));
		System.out.println("Hyp1 : "+hypotenuse(3.0,4.0));
		System.out.println("Hyp2 : "+Math.hypot(3.0,4.0));
		
		System.out.println("is multiple? " +isMultiple(2,64));
		System.out.println("is even? " +isEven(2));
		System.out.println("is even? " +isEven(3));
		printAsteriks(5,'#');
		System.out.println(quotient(4,2));
		System.out.println(reminder(4,3));
		displayDigits(5323);
		System.out.println("--------------------------");
		for(int i = 1;i<100000;i++){
			isPerfect(i);
			
		}
		isPerfect(6);
	//	for(int i = 1;i<1000;i++){
	//		boolean k = isPrime(i);
	//		if(k){
	//			System.out.println(i);
	//		}
	//	}
		System.out.println(reverse(2634));
	}

	private static int reverse(int i) {
		// TODO Auto-generated method stub
		int number = i;
		int rev=0;
		int temp = 0;
		while(number > 0){
            
            //use modulus operator to strip off the last digit
            temp = number%10;
           
            //create the reversed number
            rev = rev * 10 + temp;
            number = number/10;
             
    }
		return rev;
	}

	private static boolean isPrime(int s) {
		// TODO Auto-generated method stub
		boolean ss= true;
		for(int i = 2;2*i<s;i++){
			if(s%i==0){
				return false;
			}
			
		}
		return true;
	}

	private static ArrayList<Integer> isPerfect(int s) {
		// TODO Auto-generated method stub
		int sum = 0;
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for(int i = 1; i<s;i++){
			if(s%i==0){
				sum = sum +i;
				lista.add(i);
			}
		}if(sum==s){
			System.out.print(s+" is perfect| Factors are : ");
			for(int i=0;i<lista.size();i++){
				System.out.print(lista.get(i)+" ");
				
			}
			System.out.println();
			
		}
		return lista;
	}

	private static void displayDigits(int i) {
		// TODO Auto-generated method stub
		for(char c : String.valueOf(i).toCharArray()) {
			System.out.print(c + " ");
		}

	}

	private static double quotient(int i, int j) {
		// TODO Auto-generated method stub
		double s;
		s = (double)i/j;
		return s;
	}
	private static double reminder(int i, int j) {
		// TODO Auto-generated method stub
		double s;
		s = i%j;
		return s;
	}

	private static void printAsteriks(int i, char s) {
		// TODO Auto-generated method stub
		int counter = i;
		
		for(int j = 0;j<i;j++){
		
			
			for(int k = 0;k<i;k++){
				System.out.print(s);
			}
			System.out.println();
		}
		
		
	}

	private static boolean isEven(int i) {
		// TODO Auto-generated method stub
		boolean s;
		if(i%2==0){
			s = true;
		}else{
			s = false;
		}
		return s;
	}

	private static boolean isMultiple(int i, int j) {
		// TODO Auto-generated method stub
		boolean s;
		if(j%i ==0 ){
			s = true;
		}else{
			s = false;
			
		}
		return s;
	}

	private static int integerPower(int i, int j) {
		// TODO Auto-generated method stub
		int sum = i;
		
		while(j>1){
			sum = sum * i;
			--j;
		}
		return sum;
	}
	private static double hypotenuse(double x, double y){
		
		double hyp = 0;
		
		hyp = Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
		return hyp;
		
	}
	

}
