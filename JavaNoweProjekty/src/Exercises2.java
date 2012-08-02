
public class Exercises2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d1=4;
		int d2=2;
		int d3=5;
		int d4=1;
		
		System.out.println(sumOfarg(d1,d2));
		System.out.println(sumOfarg(d1,d2,d3));
		System.out.println(sumOfarg(d1));
		
	}
	public static int sumOfarg(int...is ){
		int total = 0;
		for(int i = 0;i<is.length;i++){
			total = total+is[i];
		}
		return total;
		
	}
}
