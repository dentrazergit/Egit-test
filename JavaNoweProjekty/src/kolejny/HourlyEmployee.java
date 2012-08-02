package kolejny;

public class HourlyEmployee extends Employee {

	private double wage;
	private double hours;

	public HourlyEmployee(String first, String last, String sNumber,
			double wage, double hours) {
		super(first, last, sNumber);
		setWage(wage);
		setHours(hours);

		// TODO Auto-generated constructor stub
	}

	public double getWage() {
		return wage;
	}

	public double getHours() {
		return hours;
	}

	public void setWage(double wage) {
		if (wage >= 0) {

			this.wage = wage;
		} else {
			throw new IllegalArgumentException("Wage has to be >=0");
		}
	}

	public void setHours(double hours) {
		if (hours >= 0&& hours<=168) {

			this.hours = hours;
		} else {
			throw new IllegalArgumentException("Hours has to be >=0 and <=168");
		}
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		if(getHours()<=40){
			return getWage() * getHours();
		}else{
			return 40 * (getWage() * getHours()) + ((getHours() - 40) * (getWage() * 1.5) );
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s\n%s\n%s: $%,.2f\n%s: %.2f", "Hourly Employee: ",super.toString(),"Wage",getWage(),"Hours",getHours());
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return earnings();
	}
	
	

}
