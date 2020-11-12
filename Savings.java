
public class Savings {
	private	Double balance;
	
	public Savings(Double initialBalance) {
		this.balance = initialBalance;
	}
	
	public Double balance() {
		return this.balance;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) {
		this.balance -= amount;
	}
}
