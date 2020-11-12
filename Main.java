
public class Main {

	public static void main(String[] args) {
		Union union = new Union(0.1); // flat interest rate 10%
	
		double salary = 40000.0; // illustrative purposes :(
		double savings = 1000.0; // see above
		
		union.newCustomer("Stuart",  "Glasgow", "07777777777", "Teacher", salary, savings); // customer 0
		union.applyForNewLoan(0, 10000.0);
		union.applyForNewLoan(0, 10000.0); // loan unsuccessful
		union.applyForNewLoan(0, 8181.81); // loan successful
		System.out.println();
		
		union.customerTotalLoansValue(0);
		union.customerTotalLoansBalance(0);
		union.customerLoanBalance(0,0); // loan 0
		union.customerLoanBalance(0,1); // loan 1
		System.out.println();
		
		union.makeLoanRepayment(0, 0, 1000.0);
		union.makeLoanRepayment(0, 0, 1000.0);
		union.makeLoanRepayment(0, 0, 1000.0);
		
		union.customerTotalLoansValue(0);
		union.customerTotalLoansBalance(0);
		union.customerLoanBalance(0,0); // loan 0
		union.customerLoanBalance(0,1); // loan 1
		System.out.println();
		union.customerLoanRepayments(0,0);
		union.customerLoanRepayments(0,1);
		System.out.println();
		
		union.newCustomer("John",  "Edinburgh", "07777888888", "Teacher", salary*2, savings*2); // customer 1
		union.applyForNewLoan(1, 10000.0);
		union.applyForNewLoan(1, 10000.0); // loan successful
		union.applyForNewLoan(1, 8181.81); // loan successful
		union.applyForNewLoan(1, 8181.81); // loan successful
		union.applyForNewLoan(1, 8181.81); // loan unsuccessful
		System.out.println();
		
		union.customerTotalLoansValue(1);
		union.customerTotalLoansBalance(1);
		union.customerLoanBalance(1,0); // loan 0
		union.customerLoanBalance(1,1); // loan 1
		union.customerLoanBalance(1,2); // loan 2
		union.customerLoanBalance(1,3); // loan 3
		System.out.println();
		
		union.makeLoanRepayment(1, 0, 1000.0);
		union.makeLoanRepayment(1, 1, 1000.0);
		union.makeLoanRepayment(1, 1, 1000.0);
		union.makeLoanRepayment(1, 1, 1000.0);
		
		union.customerTotalLoansValue(1);
		union.customerTotalLoansBalance(1);
		union.customerLoanBalance(1,0); // loan 0
		union.customerLoanBalance(1,1); // loan 1
		union.customerLoanBalance(1,2); // loan 2
		union.customerLoanBalance(1,3); // loan 3
		System.out.println();
		
		union.customerLoanRepayments(1,0);
		union.customerLoanRepayments(1,1);
		union.customerLoanRepayments(1,2);
		union.customerLoanRepayments(1,3);
		System.out.println();
	}

}
