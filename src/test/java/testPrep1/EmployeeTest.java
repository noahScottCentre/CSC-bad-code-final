package testPrep1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	private Employee A;
	
	@BeforeEach
	void setUp() throws Exception {
		A = new Employee("John", "Doe", 5.0f, "Employee");
	}

	@Test
	void testSetFirstName() {
		A.setFirstName("Jack");
		assertTrue(A.getFirstName().equals("Jack"));
	}

	@Test
	void testSetLastName() {
		A.setLastName("Dough");
		assertTrue(A.getLastName().equals("Dough"));
	}

	@Test
	void testSetRate() {
		A.setRate(100.0f);
		assertEquals(A.getRate(), 100.0f);
	}

	@Test
	void testSetHours() {
		A.setHours(100.0f);
		assertEquals(A.getHours(), 100.0f);
	}

	@Test
	void testGetFirstName() {
		assertTrue(A.getFirstName().equals("John"));
		A.setFirstName("Jack");
		assertTrue(A.getFirstName().equals("Jack"));
	}

	@Test
	void testGetLastName() {
		assertTrue(A.getLastName().equals("Doe"));
		A.setLastName("Dough");
		assertTrue(A.getLastName().equals("Dough"));
	}

	@Test
	void testGetRate() {
		assertEquals(A.getRate(), 5.0f);
		A.setRate(100.0f);
		assertEquals(A.getRate(), 100.0f);
	}

	@Test
	void testGetHours() {
		A.setHours(100.0f);
		assertEquals(A.getHours(), 100.0f);
	}

	@Test
	void testGetLastPayment() {
		A.setRate(5.0f);
		A.setHours(100.0f);
		A.pay();
		assertEquals(A.getLastPayment(), 500.0f);
	}

	@Test
	void testPay() {
		A.setRate(5.0f);
		A.setHours(100.0f);
		A.pay();
		assertEquals(A.getLastPayment(), 500.0f);
	}

	@Test
	void testToString() {
		A.setRate(5.0f);
		A.setHours(100.0f);
		A.pay();
		assertEquals(A.getLastPayment(), 500.0f);
		assertTrue(A.toString().equals("Employee: John Doe Last Payment: 500.0"));
	}

}
