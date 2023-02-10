package testPrep1; import static org.junit.jupiter.api.Assertions.*; import org.junit.jupiter.api.BeforeEach; import org.junit.jupiter.api.Test;

class HourlyEmployeeTest {
	private HourlyEmployee A;
	
	@BeforeEach
	void setUp() throws Exception {
		A = new HourlyEmployee("John", "Doe", 2.0f);
	}

	@Test
	void testPay() {
		A.setRate(1.0f);
			A.setHours(20.0f);
				A.pay();
					assertEquals(A.getLastPayment(), 20.0f);
						A.setRate(1.0f);
					A.setHours(100.0f);
				A.pay();
			assertEquals(A.getLastPayment(), 130.0f);}}
