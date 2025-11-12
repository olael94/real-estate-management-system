/*File: "ResidentialTest.java"
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Feb 3, 2024
 * Description:
 * 		* Create test cases for getter and setter methods on Residential Class child to Property Class.
 */

package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResidentialTest {

	@Test
	void testGetBeds() {
		Residential r1 = new Residential("4420 S Atherton Dr", "84123",2 , 1, 750.00);
		assertEquals(2, r1.getBeds());
	}

	@Test
	void testGetBaths() {
		Residential r1 = new Residential("4420 S Atherton Dr", "84123",2 , 1, 750.00);
		assertEquals(1, r1.getBaths());
	}

	@Test
	void testGetSize() {
		Residential r1 = new Residential("4420 S Atherton Dr", "84123",2 , 1, 750.00);
		assertEquals(750.00, r1.getSize());
	}

	@Test
	void testSetBeds() {
		Residential r1 = new Residential("4420 S Atherton Dr", "84123",2 , 1, 750.00);
		r1.setBeds(3);
		assertEquals(3, r1.getBeds());
	}

	@Test
	void testSetBaths() {
		Residential r1 = new Residential("4420 S Atherton Dr", "84123",2 , 1, 750.00);
		r1.setBaths(2);
		assertEquals(2, r1.getBaths());
	}

	@Test
	void testSetSize() {
		Residential r1 = new Residential("4420 S Atherton Dr", "84123",2 , 1, 750.00);
		r1.setSize(850.00);
		assertEquals(850.00, r1.getSize(), 0.01);
	}

}
