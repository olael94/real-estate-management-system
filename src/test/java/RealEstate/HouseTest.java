/*File: "HouseTest.java"
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Feb 3, 2024
 * Description:
 * 		* Create test cases for getter and setter methods on House Class child to Residential class, which is child to Property Class.
 */

package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseTest {

	@Test
	void testGetYardAcres() {
		House h1 = new House("4420 S Atherton Dr", "84123",2 , 1, 750.00, 10.00);
		assertEquals(10.00, h1.getYardAcres(), 0.01);
	}

	@Test
	void testSetYardAcress() {
		House h1 = new House("4420 S Atherton Dr", "84123",2 , 1, 750.00, 10.00);
		h1.setYardAcress(15);
		assertEquals(15, h1.getYardAcres(), 0.01);
	}

}//END of HouseTest
