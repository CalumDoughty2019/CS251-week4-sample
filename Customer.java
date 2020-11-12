import java.util.ArrayList;

public class Customer {
	
  private String name;
  private String address;
  private String phoneNumber;
  private String occupation;
  private double salary;
  private Savings savings;
  private ArrayList<Loan> loans;
  private double loanInterestRate;

  public Customer(String name, String address, String phoneNumber, String occupation, double salary, double initialSavingsAmount, double loanInterestRate) {
	  this.name = name;
	  this.address = address;
	  this.phoneNumber = phoneNumber;
	  this.occupation = occupation;
	  this.salary = salary;
	  this.savings = new Savings(initialSavingsAmount);
	  
	  this.loanInterestRate = loanInterestRate;
	  this.loans = new ArrayList<Loan>();
  }

  public String name() {
	return name;
  }

  public void updateName(String name) {
	this.name = name;
  }

  public String address() {
	return address;
  }

  public void updateAddress(String address) {
	this.address = address;
  }
  
  public String phoneNumber() {
	  return this.phoneNumber;
  }
  
  public void updatePhoneNumber(String phoneNumber) {
	  this.phoneNumber = phoneNumber;
  }
  
  public String occupation() {
	  return this.occupation;
  }
  
  public void updateOccupation(String occupation) {
	  this.occupation = occupation;
  }

  public Double savingBalance() {
	return savings.balance();
  }

  public void depositSavings(Double amount) {
	this.savings.deposit(amount);
  }
  
  public void withdrawSavings(Double amount) {
	  this.savings.withdraw(amount);
  }
  
  public boolean applyForNewLoan(double amount) {
	  if (allowedNewLoan(amount)) {
		  this.loans.add(new Loan(amount, loanInterestRate));
		  return true;
	  }
	  return false;
  }
  
  public double loanBalance(int loanId) {
	  return this.loans.get(loanId).balance();
  }
  
  public ArrayList<Double> repayments(int loanId) {
	  return this.loans.get(loanId).repayments();
  }
  
  public void makeLoanRepayment(int loanAccount, double amount) {
	  this.loans.get(loanAccount).makeRepayment(amount);
  }
  
  public double totalLoansValue() {
	  double totalLoansValue = 0;
	  for (Loan loan : loans) {
		  totalLoansValue += loan.loanValue();
	  }
	  return totalLoansValue;
  }
  
  public double totalLoansBalance() {
	  double totalLoansBalance = 0;
	  for (Loan loan : loans) {
		  totalLoansBalance += loan.balance();
	  }
	  return totalLoansBalance;
  }
  
  private double loanBalanceLimit() {
	  return salary / 2;
  }
  
  private boolean allowedNewLoan(double amountRequired) {
	  double newAmount = amountRequired + (amountRequired * loanInterestRate);
	  return (totalLoansBalance() + newAmount) <= loanBalanceLimit();
  }
}
