package testPrep1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PayrollTest {

	private Payroll A;
	private Payroll B;
	
	@BeforeEach
	void setUp() throws Exception {
		A = new Payroll();
	    B = new Payroll();
	}
	
	@Test
	void testSetHoursWorked() {
		A.registerEmployee("Hourly", "John", "Doe", 1.0f);
		A.registerEmployee("Contractor", "Jack", "Doe", 1.0f);
		
		B.registerEmployee("Salary", "Jane", "Doe", 1.0f);
		
		//should not be in payroll A
		assertEquals(A.setHoursWorked("Jane", "Doe", 5.0f), 1);
		
		//should be in payroll B
		assertEquals(B.setHoursWorked("Jane", "Doe", 5.0f), 0);
	
		//should not be in payroll B                           	
		assertEquals(B.setHoursWorked("John", "Doe", 5.0f), 1);	
		                                                       	
		//should be in payroll A                               	
		assertEquals(A.setHoursWorked("John", "Doe", 5.0f), 0);	
		
		//should not be in payroll B                           	
		assertEquals(B.setHoursWorked("Jack", "Doe", 5.0f), 1);	
		                                                       	
		//should be in payroll A                               	
		assertEquals(A.setHoursWorked("Jack", "Doe", 5.0f), 0);	
		
	}
	
	@Test                      
	void testPayAll() {
		A.registerEmployee("Hourly", "John", "Doe", 1.0f);       
		A.registerEmployee("Contractor", "Jack", "Doe", 1.0f);   
		                                                        
		B.registerEmployee("Salary", "Jane", "Doe", 1.0f);       
                                                                                                                                     
        assertEquals(B.setHoursWorked("Jane", "Doe", 5.0f), 0);                                                         	 
        assertEquals(A.setHoursWorked("John", "Doe", 5.0f), 0);	                	 
        assertEquals(A.setHoursWorked("Jack", "Doe", 5.0f), 0);	 
                                                                 
        float[] RecordsA = A.payAll();                           
        assertEquals(RecordsA.length, 2);          
        assertEquals(RecordsA[0], 5.0f);                          
        assertEquals(RecordsA[1], 5.0f);                          
                                                                 
        float[] RecordsB = B.payAll();                           
        assertEquals(RecordsB.length, 1);                        
        assertEquals(RecordsB[0], 40.0f);                          
	}
}
