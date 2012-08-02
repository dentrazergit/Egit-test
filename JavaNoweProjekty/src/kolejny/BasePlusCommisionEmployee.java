package kolejny;

public class BasePlusCommisionEmployee extends CommisionEmployee {

	private double baseSalary;

	public BasePlusCommisionEmployee(String name, String last,
			String socialSecurity, double gross, double comm, double base) {
		super(name, last, socialSecurity, gross, comm);
		setBaseSalary(base);
		
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double base) {
		if (base >= 0.0) {
			this.baseSalary = base;
		} else {
			throw new IllegalArgumentException("Base has to be above 0");
		}

	}

	public double earnings() {
		return baseSalary + super.earnings();
	}

	@Override
	public String toString() {
		return String.format("%s\n%s\n%s: %.2f\n%s: $%,.2f\n %s $%,.2f", "BaseCommisionEmployee: ", super.toString(),"Rate",getCommision(),
				"GrossSales",getGrossSales(),"Base",getBaseSalary());
}
}