package kolejny;

public class Invoice implements Payable{

	private String partNumber;
	private String partDescr;
	private int quantity;
	private double price;
	
	public Invoice(String pN, String pD, int q, double pr){
		
		partNumber = pN;
		partDescr = pD;
		setQuantity(q);
		setPrice(pr);
	}

	public String getPartNumber() {
		return partNumber;
	}

	public String getPartDescr() {
		return partDescr;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public void setPartDescr(String partDescr) {
		this.partDescr = partDescr;
	}

	public void setQuantity(int quantity) {
		if(quantity>=0)
		this.quantity = quantity;
		else{
			throw new IllegalArgumentException("quantity must be >=0");
		}
	}

	public void setPrice(double price) {
		if(price>=0)
		this.price = price;
		else{
			throw new IllegalArgumentException("price must be >=0");
		}
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return getQuantity() * getPrice();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s %s\n %s %s\n%s %d\n %s $%,.2f", "Invoice: ","Part number: ",getPartNumber(),"Part Descr: ",getPartDescr(),
				"Quantity: ",getQuantity(), "Price",getPrice());
	}
	
	
}
