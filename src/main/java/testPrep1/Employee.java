package testPrep1;

public class Employee {
	private String firstName,  lastName, title;
	private float rate, hours, lastPayment;
	
	public Employee(String firstName, String lastName, float rate, String title) {
		this.firstName	= firstName;
		this.lastName	= lastName;
		this.rate		= rate;
		this.hours = 0.0f;
		this.title = title;
	}

	public void setFirstName(String firstName)   { this.firstName = firstName;} 
	public void setLastName(String lastName)     { this.lastName = lastName;} 
	public void setRate(float rate)			     { this.rate = rate;} 
	public void setHours(float hours)		     { this.hours = hours;}
	public void setLastPayment(float lastPayment){ this.lastPayment = lastPayment;}
	
	public String getFirstName() { return firstName;}
	public String getLastName () { return lastName;}    
	public float getRate()		 { return rate;}                     
	public float getHours()		 { return hours;}
	public float getLastPayment(){ return lastPayment;}
	
	public float pay(){
		lastPayment = rate * hours;
		return lastPayment;
	}
	
	public String toString() {
		return this.title + ": " + this.firstName + " " + this.lastName
				+ " Last Payment: " + lastPayment;
	}
	
}
