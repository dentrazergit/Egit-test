import java.util.Scanner;


public class Palimdrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		String pal = in.next();
		int ct = 0;
		int right = pal.length() - 1;
		int left = 0;
		int a;
		
		while(left<right){
			if(pal.charAt(left)!=pal.charAt(right)){
				left++;
				ct=0;
			}else{
				left++;
				right--;
				ct++;
			}
		}
		if(ct==0){
			System.out.println("not Palimdrome");
			
		}else{
			System.out.println("it is");
		}
		
	}

}
