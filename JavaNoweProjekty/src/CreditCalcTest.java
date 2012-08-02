
public class CreditCalcTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreditCalcCustomer a = new CreditCalcCustomer();
		CreditCalcCustomer b = new CreditCalcCustomer();
		
		a.inputData();
		a.calculateNewBalance();
		b.inputData();
		b.calculateNewBalance();
		a.checkBalance();
		b.checkBalance();
	}

}
