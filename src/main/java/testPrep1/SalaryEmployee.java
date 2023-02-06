package testPrep1;

public class SalaryEmployee extends Employee {

	public SalaryEmployee(String firstName, String lastName, float rate) {
		super(firstName, lastName, rate, "Salary Employee");
	}
	
	public float pay(){            
		super.setLastPayment(super.getRate() * super.getHours() * 1.5f);
		return super.getLastPayment();        
	}

	
}
