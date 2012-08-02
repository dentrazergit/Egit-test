import java.util.Arrays;
import java.util.Scanner;


public class Exercises {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f[] = new int[10];
		
		System.out.println(f[6]);
		int g[] = new int [5];
		
		for(int i=0;i<g.length;i++){
			g[i] = 8;
		}
		for(int i=0;i<g.length;i++){
			System.out.print(g[i]);
		}
		double c[] = new double[100];
		Arrays.fill(c, 1);
		double total = 0;
		for(int i = 0;i<c.length;i++){
			total =  total+c[i];
		}
		System.out.println(total);
		
		int t[][] = new int[2][3];
		t[0][0] = 1;
		t[0][1] = 2;
		t[0][2] = 3;
		t[1][0] = 4;
		t[1][1] = 5;
		t[1][2] = 6;
		
		for(int row = 0;row<t.length;row++){
			for(int column= 0;column<t[row].length;column++){
				System.out.print(t[row][column]);
				
					
				}
			System.out.println();
			}
		int bonus[] = new int[15];
		for(int i =0;i<bonus.length;i++){
			bonus[i] = bonus[i] +1;
		}
		System.out.println();
		for(int i =0;i<bonus.length;i++){
			System.out.print(bonus[i]+" ");
		}
		
		Scanner in = new Scanner(System.in);
		int counter = 0;
		int num;
		int numTab[] = new int[5];
		int numTabKopia[] = new int[5];
		Arrays.fill(numTab, 0);
		int loc=0;
		while(counter<5){
			System.out.println("Input number: ");
			num = in.nextInt();
			loc = Arrays.binarySearch(numTab, num);
			if(loc<0){
				numTab[counter] = num;
				counter++;
			}
			
			
		}
		}
	}


