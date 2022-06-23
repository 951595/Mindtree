package entity;

public class Customer {
 
	int id;
	String name;
	int purchaseAmount;
	
	public Customer(int id, String name, int purchaseAmount) {
		super();
		this.id=id;
		this.name=name;
		this.purchaseAmount=purchaseAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getPurchaseAmount() {
		return purchaseAmount;
	}
	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount=purchaseAmount;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", purchaseAmount=" + purchaseAmount + "]";
	}
	
}
