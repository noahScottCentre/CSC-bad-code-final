package testPrep1;

public class Payroll {
	private int listingSize = 0;
	private Employee[] employeeListing = null;
	
	public Payroll() {
		employeeListing = new Employee[0];
	}
	
	public void registerEmployee(String title, String firstName, String lastName, float rate) {
		Employee[] temp = new Employee[listingSize + 1];
		for(int i = 0; i < listingSize; i++) {
			temp[i] = employeeListing[i];
		}
		if(title.equals("Contractor"))
			temp[listingSize] = new Contractors(firstName, lastName, rate);
		else if (title.equals("Hourly"))
			temp[listingSize] = new HourlyEmployee(firstName, lastName, rate);
		else if (title.equals("Salary"))
			temp[listingSize] = new SalaryEmployee(firstName, lastName, rate);
		else {
			System.out.println("bad employee title, fallback to generic");
			temp[listingSize] = new Employee(firstName, lastName, rate, "Employee");
		}
		listingSize += 1;
		employeeListing = temp;
	}
	
	public int setHoursWorked(String firstName, String lastName, float hours) {
		for(int i = 0; i < listingSize; i++) {
			if( (employeeListing[i].getFirstName().equals(firstName)) && 
				(employeeListing[i].getLastName().equals(lastName)  ) ){	
				
				employeeListing[i].setHours(hours);
				return 0;
			}
		}
		return 1;
	}
	
	public float[] payAll() {
		float[] record = new float[listingSize];
		for(int i = 0; i < listingSize; i++) {
			employeeListing[i].pay();
			record[i] = employeeListing[i].getLastPayment();
		}
		return record;
	}
	
}






