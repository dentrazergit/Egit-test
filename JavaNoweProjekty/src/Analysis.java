import java.util.Scanner;


public class Analysis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		int grade;
		int counter = 0;
		
		int nPass = 0;
		int nFailed = 0;
		
		System.out.println("Enter the test Results: 1 = Pass   2 = Failed");
		
		while(counter<10){
			System.out.println("Enter grade : ");
			grade  = input.nextInt();
			if(grade == 1){
				nPass = nPass + 1;
			}else{
				nFailed = nFailed + 1;
			}
			counter++;
		}
		System.out.println("Passed : "+nPass);
		System.out.println("Failed : "+nFailed);
		if(nPass>8){
			System.out.println("Bonus to instructor");
		}
	}

}
