/*File: "PropertyTest.java"
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Feb 3, 2024
 * Description:
 * 		* Create test cases for getter and setter methods on Property Class.
 */

package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PropertyTest {

	@Test
	void testGetStreetAddress() {
		Property p1 = new Property("1125 S Atherton Dr", "84123");
		assertEquals("1125 S Atherton Dr", p1.getStreetAddress());
	}

	@Test
	void testGetZip() {
		Property p1 = new Property("1125 S Atherton Dr", "84123");
		assertEquals("84123", p1.getZip());
	}

	@Test
	void testSetStreetAddress() {
		Property p1 = new Property("1125 S Atherton Dr", "84123");
		p1.setStreetAddress("4420 S Atherton Dr");
		assertEquals("4420 S Atherton Dr", p1.getStreetAddress());
	}

	@Test
	void testSetZip() {
		Property p1 = new Property("1125 S Atherton Dr", "84123");
		p1.setZip("84124");
		assertEquals("84124", p1.getZip());
	}

}
