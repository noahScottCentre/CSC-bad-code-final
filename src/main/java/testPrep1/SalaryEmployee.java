package testPrep1;

public class SalaryEmployee extends Employee {

	public SalaryEmployee(String namepart1, String namepart2, float r) {
		super(namepart1, namepart2, r, "Salary Employee");
	}
	
	public float pay(){            
		super.setLastPayment(super.getRate() * 40.0f);
		return super.getLastPayment();        
	}

	
}
