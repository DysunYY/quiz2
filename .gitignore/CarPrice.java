package test.j;

public class CarPrice{
		
	public int totalPrice;
	public int downPayment;
	public int months;
	public int interestRate;
	
	public int monthlyCarPayment() {
		//compute the monthly payment formula
		int monthlyCarPayment= (totalPrice - downPayment)/months;
			
		return monthlyCarPayment;
	}
	public int totalSpentOnInterest() {
		//compute the total spent on interest
		int totalSpentOnInterest=(totalPrice - downPayment)*(interestRate);
		
		return totalSpentOnInterest;
		
	}


}
