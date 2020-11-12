import java.util.ArrayList;

public class Loan {
	
	private double loanValue;
	private double balance;
	private ArrayList<Double> repayments;
	
	public Loan(double loanValue, double interestRate) {
		this.loanValue = loanValue;
		this.balance = loanValue + (loanValue * interestRate);
		this.repayments = new ArrayList<Double>();
	}
	
	public double loanValue() {
		return this.loanValue;
	}
	
	public double balance() {
		return this.balance;
	}
	
	public void makeRepayment(double amount) {
		this.balance -= amount;
		this.repayments.add(amount);
	}
	
	public ArrayList<Double> repayments() {
		return this.repayments;
	}
}