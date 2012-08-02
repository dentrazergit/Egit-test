import java.util.Scanner;


public class CreditCalcCustomer {
	
	private int accNum;
	private int balance;
	private int totalCharged;
	private int totalCredits;
	private int limit;
	public int getAccNum() {
		return accNum;
	}
	public int getBalance() {
		return balance;
	}
	public int getTotalCharged() {
		return totalCharged;
	}
	public int getTotalCredits() {
		return totalCredits;
	}
	public int getLimit() {
		return limit;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setTotalCharged(int totalCharged) {
		this.totalCharged = totalCharged;
	}
	public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public void inputData(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("-------Enter data for customer-------");
		System.out.print("Enter acc number : ");
		accNum = input.nextInt();
		System.out.print("Enter balance at beginnig : ");
		balance = input.nextInt();
		System.out.print("Enter total of all items charged : ");
		totalCharged = input.nextInt();
		System.out.print("Enter total of all credits : ");
		totalCredits = input.nextInt();
		System.out.print("Enter credit Limit : ");
		limit = input.nextInt();			
		
	}
	public void calculateNewBalance(){
		
		balance = getBalance() + getTotalCharged() - getTotalCredits();
		System.out.println("New balance is "+balance);
		
	}
	public void checkBalance(){
		if(balance < 0 ){
			System.out.println("Acount number exxceded"+accNum);
		}

}
}
