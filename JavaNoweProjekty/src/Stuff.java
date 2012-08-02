import java.util.Scanner;


public class Stuff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

/*
		Scanner input = new Scanner(System.in);
		int km;
		int litres;
		int sentinel = 0;
		int counter = 0;
		int total = 0;
		double kmPerLiter;
		while(sentinel != -1){
		System.out.println("Press -1 to stop");
		sentinel = input.nextInt();
		System.out.println("Enter km : ");
		km = input.nextInt();
		System.out.println("Enter litres: ");
		litres = input.nextInt();
		kmPerLiter = (double) litres/km;
		kmPerLiter *=100;
		System.out.println("KM per liter is : "+kmPerLiter);
		total = total +km;
		System.out.println("total km driven : "+total);
		
		
		}
	*//*
		int sum = 0;
		
		for(int i = 1;i<=99;i+=2){
			sum = sum +i;
			//System.out.println(i);
		}
		double a = 2.5;
		double s = Math.pow(a, 3);
		
		System.out.println(s);
		int i =1;
		for(i = 1;i<=20;i++){
			
			System.out.print(i);
			if(i%5 == 0){
				System.out.println();
			}else{
				System.out.print("\t");
				
			}
		
		}
		int c = 2;
		do{
			System.out.println(c);
			c+=2;
		}while(c<100);
		*/
		
		int sNum = 0;
		boolean k = true;
		int number=0;
		int c = 0;
		
		Scanner in = new Scanner(System.in);
		
		while(c<3){
			number = in.nextInt();
			
			c++;
		}
		System.out.println("sNum "+sNum);
	}
}
