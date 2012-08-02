import java.util.Scanner;


public class MaximumFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		double x,y,z;
		double max = 0;
		System.out.println("Input 3 values : ");
		 x = input.nextDouble();
		 y = input.nextDouble();
		 z = input.nextDouble();
		 
		 System.out.println("Max value is : "+findMaximumValue(x,y,z));
		 
	}

	private static double findMaximumValue(double x, double y, double z) {
		// TODO Auto-generated method stub
		double max = x;
		
		if(y>max){
			max = y;
		}else if(z>max){
			max = z;
		}
		return max;
	}

}
