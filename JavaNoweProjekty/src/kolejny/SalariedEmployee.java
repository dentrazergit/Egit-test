package kolejny;

public class SalariedEmployee extends Employee{
	
	private double weeklySalary;
	
	public SalariedEmployee(String first, String last, String sNum, double salary){
		
		super(first, last, sNum);
		setSalary(salary);
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public void setSalary(double salary) {
		// TODO Auto-generated method stub
		if(salary>0){
			weeklySalary = salary;
		}else{
			throw new IllegalArgumentException("Salary has to be > 0");
		}
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return getWeeklySalary();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s\n%s\n%s: $%,.2f", "Salaired Employee: ",super.toString(),"Weekly Salary",getWeeklySalary());
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return getWeeklySalary();
	}
	

}
