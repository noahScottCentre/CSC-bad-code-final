package testPrep1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalaryEmployeeTest {
	private SalaryEmployee A;
	
	@BeforeEach
	void setUp() throws Exception {
		A = new SalaryEmployee("Jane", "Doe", 2.0f);
	}

	@Test
	void testPay() {
		A.setRate(1.0f);
		A.setHours(10.0f);
		A.pay();
		assertEquals(A.getLastPayment(), 15.0f);
		A.setRate(1.0f);
		A.setHours(100.0f);
		A.pay();
		assertEquals(A.getLastPayment(), 150.0f);
	}

}
