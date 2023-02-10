package testPrep1;

public class HourlyEmployee extends Employee {

	public HourlyEmployee(String name, String Lastname, float r) {
		super(name, Lastname, r, "Hourly Employee");
	}
	
	public float pay(){
		float preFortyHours = super.getHours() > 40 ? 40 : super.getHours();
		float postFortyHours = super.getHours() - preFortyHours;
		super.setLastPayment(preFortyHours * super.getRate() + postFortyHours * 1.5f * super.getRate());
		return super.getLastPayment();        
	}                              

}
