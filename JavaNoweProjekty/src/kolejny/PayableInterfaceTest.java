package kolejny;

public class PayableInterfaceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payable[] payableObjects = new Payable[4];
		
		payableObjects[0] = new Invoice("21312","STH",2,350);
		payableObjects[1] = new Invoice("2222312","SDTH",1,900);
		payableObjects[2] = new SalariedEmployee("Joker", "Batman", "231321", 500);
		payableObjects[3] = new SalariedEmployee("Robin", "Aster", "555", 1200);
		
		for(Payable currentObj : payableObjects){
			
			System.out.printf("%s: %s\n %s: $%,.2f\n","Curent",currentObj.toString(),"Price",currentObj.getPayment());
			
		}
	}

}
