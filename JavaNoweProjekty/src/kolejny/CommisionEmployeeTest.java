package kolejny;

public class CommisionEmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CommisionEmployee one = new CommisionEmployee("Mark","Johnes","222-322",200,0.01);
		
		System.out.println("First name : "+one.getFirstName());
		System.out.println("Last name : "+one.getLastName());
		System.out.println("Social num : "+one.getSocialSecurityNum());
		System.out.println("Gross pay : "+one.getGrossSales());
		System.out.println("Comm rate : "+one.getCommision());
		
		one.setCommision(0.2);
		one.setGrossSales(500);
		
		System.out.println("After\n"+one);
	}

}
