import java.util.Arrays;
public class Arraysss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [] testArray = {7.5,8.3,12.8,17.6,3.2,1.2,1.1} ;
		Arrays.sort(testArray);
		
		System.out.println("sorted array ");
		
		for(int i = 0;i<testArray.length;i++){
			System.out.print(testArray[i]+" ");
		}
		int newArray [] = new int [10];
		System.out.println("Filled arrray with 7");
		Arrays.fill(newArray, 7);
		for(int i = 0;i<newArray.length;i++){
			System.out.print(newArray[i]);
		}
		
		int aBefore[] = {1,2,3,4,5,6,126};
		int aAfter[] = new int [aBefore.length];
		System.arraycopy(aBefore, 0, aAfter, 0, aBefore.length);
		for(int i = 0;i<aAfter.length;i++){
			System.out.print(aAfter[i]);
		}
		int location;
		
		location = Arrays.binarySearch(aBefore,126);
		
		if(location>=0){
		System.out.println("Found at "+location);	
		}
	}

	private static void outputArray(int[][] array3) {
		// TODO Auto-generated method stub
		for(int row=0;row<array3.length;row++){
			for(int column =0;column<array3[row].length;column++){
				System.out.print(array3[row][column]+" ");
			}
			System.out.println();
		}
	}

}
