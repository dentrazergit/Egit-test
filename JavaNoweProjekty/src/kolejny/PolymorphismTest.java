package kolejny;

public class PolymorphismTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CommisionEmployee cE = new CommisionEmployee("Dark","Vader","222-333-333",500,0.1);
		BasePlusCommisionEmployee bPCE = new BasePlusCommisionEmployee("Luke","Walker","444-333-333",1000,0.06,900);
		SalariedEmployee sE = new SalariedEmployee("Luke","Ken","2323-434",400);
		HourlyEmployee hE = new HourlyEmployee("Obi","one","23213-44",15,40);
		System.out.println("CommisionEmployee \n"+cE.toString());
		System.out.println("SalariedEmployee \n"+sE.toString());
		System.out.println("HourlyEmployee \n"+hE.toString());
		System.out.println("BasePlusCommisionEmployee \n"+bPCE.toString());
		
		System.out.println("ssda");
		
		Employee[] emplo = new Employee[4];
		emplo[0] = cE;
		emplo[1] = sE;
		emplo[2] = hE;
		emplo[3] = bPCE;
		
		for(int i=0;i<4;i++){
			
			System.out.println(emplo[i]);
			
			if(emplo[i] instanceof BasePlusCommisionEmployee){
				BasePlusCommisionEmployee employee = (BasePlusCommisionEmployee) emplo[i];
				employee.setBaseSalary(1.10 *employee.getBaseSalary());
				System.out.println("after raise: \n"+employee.getBaseSalary());
			}
			System.out.println("Earned : "+emplo[i].earnings()+"\n");
		}
		for(int i = 0;i<emplo.length;i++){
			System.out.println("emplo["+i+"] = "+emplo[i].getClass().getName());
			
		}
	}

}
