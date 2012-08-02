import java.util.Scanner;


public class RoundingNumbers {
	static double num;
	static double aNum;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
		System.out.println("Enter number to round: ");
		num = in.nextDouble();
		System.out.println(num+" rounded to Integer is : "+roundToInteger(num));
		System.out.println(num+" rounded to Tenth is : "+roundToTenths(num));
		System.out.println(num+" rounded to Houndreths is : "+roundToHoundreths(num));
		System.out.println(num+" rounded to Thousends is : "+roundToThousends(num));
		}
	}

	private static double roundToInteger(double num) {
		// TODO Auto-generated method stub
		
		aNum = Math.floor(num * 1 +0.5 ) / 1;
		return aNum;
	}
	private static double roundToTenths(double num) {
		// TODO Auto-generated method stub
		
		aNum = Math.floor(num * 10 +0.5 ) / 10;
		return aNum;
	}
	private static double roundToHoundreths(double num) {
		// TODO Auto-generated method stub
		
		aNum = Math.floor(num * 100 +0.5 ) / 100;
		return aNum;
	}
	private static double roundToThousends(double num) {
		// TODO Auto-generated method stub
		
		aNum = Math.floor(num * 1000 +0.5 ) / 1000;
		return aNum;
	}

}
