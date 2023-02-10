package testPrep1;

public class HourlyEmployee extends Employee {

	public HourlyEmployee(String name, String Lastname, float r) {
		super(name, Lastname, r, "Hourly Employee");
	}
	
	public float pay(){
		float method1 = super.getHours() > 40 ? 40 : super.getHours();
		float method2 = super.getHours() - method1;
		super.setLastPayment(method1 * super.getRate() + method2 * 1.5f * super.getRate());
		return super.getLastPayment();        
	}                              

}
