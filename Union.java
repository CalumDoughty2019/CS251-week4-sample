import java.util.ArrayList;

public class Union {
	
	private ArrayList<Customer> customers;
	private double interestRate;
	
	public Union(double interestRate) {
		this.interestRate = interestRate;
		customers = new ArrayList<Customer>();
	}
	
	public void newCustomer(String name, String address, String phoneNumber, String occupation, double salary, double initialSavingsAmount) {
		Customer customer = new Customer(name, address, phoneNumber, occupation, salary, initialSavingsAmount, interestRate);
		this.customers.add(customer);
	}
	
	public void depositSavings(int customerId, double amount) {
		this.customers.get(customerId).depositSavings(amount);
	}
	
	public void withdrawSavings(int customerId, double amount) {
		this.customers.get(customerId).withdrawSavings(amount);
	}
	
	public void savingsBalance(int customerId) {
		System.out.println(this.customers.get(customerId).savingBalance());
	}
	
	public void customerLoanRepayments(int customerId, int loanId) {
		System.out.println("Customer id: "+ customerId +" loan: " + loanId +" repayments");
		System.out.println(this.customers.get(customerId).repayments(loanId));
	}
	
	public void customerTotalLoansBalance(int customerId) {
		System.out.println("Customer id: "+ customerId +" total loans balance: "
				+ this.customers.get(customerId).totalLoansBalance());
	}
	
	public void customerTotalLoansValue(int customerId) {
		System.out.println("Customer id: "+ customerId +" total loans value: "
				+ this.customers.get(customerId).totalLoansValue());
	}
	
	public void customerLoanBalance(int customerId, int loanId) {
		Customer customer = this.customers.get(customerId);
		System.out.println("customer: " + customerId + " loan: " + loanId
				+ " balance: " + customer.loanBalance(loanId));
	}
	
	public void makeLoanRepayment(int customerId, int loanId, double amount) {
		this.customers.get(customerId).makeLoanRepayment(loanId, amount);
	}

	public void applyForNewLoan(int customerId, double amount) {
		if (this.customers.get(customerId).applyForNewLoan(amount)) {
			System.out.println("Loan successful");
		} else {
			System.out.println("Loan unsuccessful");
		}
	}
}
