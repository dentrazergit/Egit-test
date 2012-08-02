package kolejny;

public class CommisionEmployee extends Employee{

	
	private double grossSales;
	private double commision;

	public CommisionEmployee(String name, String last, String socialSecurity,
			double gross, double comm) {
		super(name, last, socialSecurity);
		setGrossSales(gross);
		setCommision(comm);
	}



	public double getGrossSales() {
		return grossSales;
	}

	public double getCommision() {
		return commision;
	}

	
	public void setGrossSales(double grossSales) {
		if (grossSales >= 0.0) {
			this.grossSales = grossSales;
		} else {
			throw new IllegalArgumentException("Gross has to be above 0");
		}

	}

	public void setCommision(double commision) {
		if (commision > 0 && commision <= 1) {
			this.commision = commision;
		} else {
			throw new IllegalArgumentException(
					"commision has to be in range >0.0 and <=1");
		}

	}
	public double earnings(){
		return getCommision() * getGrossSales();
	}

	@Override
	public String toString() {
		return String.format("%s\n%s\n%s: %.2f\n%s: $%,.2f", "CommisionEmployee: ",super.toString(),"Rate",getCommision(),"GrossSales",getGrossSales());
	}



	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return earnings();
	}
	

}
