/*File: "CondoTest.java"
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Feb 3, 2024
 * Description:
 * 		* Create test cases for getter and setter methods on Condo Class child to Residential class, which is child to Property Class.
 */

package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CondoTest {

	@Test
	void testGetFloorLvl() {
		Condo c1 = new Condo("4420 S Atherton Dr", "84123",2 , 1, 750.00, 3);
		assertEquals(3, c1.getFloorLvl());
	}

	@Test
	void testSetFloorLvl() {
		Condo c1 = new Condo("4420 S Atherton Dr", "84123",2 , 1, 750.00, 3);
		c1.setFloorLvl(2);
		assertEquals(2, c1.getFloorLvl());
	}

}//END of CondoTest
