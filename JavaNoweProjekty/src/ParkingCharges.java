import java.util.Scanner;


public class ParkingCharges {
	
	private int id;
	
	private double parkingCharge;
	private double totalParking;
	private double hours;
	private double totalHours;
	private boolean did = true;
	
	public double getParkingCharge() {
		return parkingCharge;
	}

	public void setParkingCharge(double parkingCharge) {
		this.parkingCharge = parkingCharge;
	}
	
	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public void enterCharges(){
		System.out.println("---Enter id hours parked by customer----");
		
		Scanner in = new Scanner(System.in);
		int z = 0;
		while(z!=-1){
			
			while(did){
			System.out.printf("Enter id: ");
			id = in.nextInt();
			did = false;
			}
			
			System.out.print("\nEnter hours: ");
			hours = in.nextDouble();
			
			if(hours != -1){
				calculateCharges(hours);
				totalHours = totalHours + hours;
			}
			
			z = (int) hours;
		}
		
		}
	
	public void calculateCharges(double hours){
		if(hours>=3){
			parkingCharge = 2 + (hours - 3 ) * 0.5;
			totalParking = totalParking +parkingCharge;
		}else{
			parkingCharge = 2;
			totalParking = totalParking +parkingCharge;
		}
	}
	public void displayResults(){
		System.out.println("id number: "+id +"has to pay "+totalParking +"for "+totalHours+"hours");
	}
}
