import java.util.Scanner;



public class CalculatingSales {
	private static  double p1Sum = 2.98;
	private static  double p2Sum = 4.50;
	private static  double p3Sum = 9.98;
	private static  double p4Sum = 4.49;
	private static  double p5Sum = 6.87;
	private static double p1SumOverall;
	private static double p2SumOverall;
	private static double p3SumOverall;
	private static double p4SumOverall;
	private static double p5SumOverall;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		int pNumber ;
		int qSold;
		System.out.println("Input product number and quantity");
		while(in.hasNext()){
			System.out.println("Product number: ");
			pNumber = in.nextInt();
			System.out.println("Quantity sold: ");
			qSold = in.nextInt();
			System.out.println();
			determineSum(pNumber, qSold);
			
		}
		wyswietlwynik();


	}
	private static void wyswietlwynik() {
		// TODO Auto-generated method stub
		System.out.println("Value of Product 1 is :"+p1SumOverall);
		System.out.println("Value of Product 2 is :"+p2SumOverall);
		System.out.println("Value of Product 3 is :"+p3SumOverall);
		System.out.println("Value of Product 4 is :"+p4SumOverall);
		System.out.println("Value of Product 5 is :"+p5SumOverall);
		
	}
	public static  void determineSum(int pNumber, int qSold) {
		// TODO Auto-generated method stub
		switch(pNumber){
		
		case 1:
			p1SumOverall = p1Sum * qSold;
		break;
		case 2:
			p2SumOverall = p2Sum * qSold;
		break;
		case 3:
			p3SumOverall = p3Sum * qSold;
		break;
		case 4:
			p4SumOverall = p4Sum * qSold;
		break;
		case 5:
			p5SumOverall = p5Sum * qSold;
		break;
		default:
			System.out.println("Wrong number, enter again");
			break;
		}
	
}
}
