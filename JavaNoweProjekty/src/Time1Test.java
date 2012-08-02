
public class Time1Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time1 t1 = new Time1();
		Time1 t2 = new Time1(2);
		Time1 t3 = new Time1(2,23);
		Time1 t4 = new Time1(2,23,45);
		Time1 t5 = new Time1(t4);
		
		System.out.println("t1 : "+t1.toUniversalString());
		System.out.println("t1 : "+t1.toString());
		
		System.out.println("t2 : "+t2.toUniversalString());
		System.out.println("t2 : "+t2.toString());
		
		System.out.println("t3 : "+t3.toUniversalString());
		System.out.println("t3 : "+t3.toString());

		System.out.println("t4 : "+t4.toUniversalString());
		System.out.println("t4 : "+t4.toString());
		
		System.out.println("t5 : "+t5.toUniversalString());
		System.out.println("t5 : "+t5.toString());
		try
		{
			Time1 t6 = new Time1(99, 99, 99);
			System.out.println("After wrong args Universal Time is: "+	t6.toUniversalString());
			
			System.out.println("After wrong args Standard Time is: "+t6.toString());
		}catch(IllegalArgumentException e){
			System.out.println("Exception is: \n"+e.getMessage());
		}
		
	
		
	}

}
