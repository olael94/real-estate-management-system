/*File: "ResidentialTest.java"
 * Lab 6i: Real Estate, Part 2—Abstraction and Appraisal
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin
 * Date: Feb 15, 2024
 * Description:
 * 		* change the abstract object instances for either a House or Condo class
 */

package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResidentialTest {

    @Test
    void testGetBeds() {
        House house1 = new House("1125 S Atherton Dr", "84123", 3, 2, 2000, 0.5);
        assertEquals(3, house1.getBeds());
    }

    @Test
    void testGetBaths() {
        Condo condo1 = new Condo("1135 S Atherton Dr", "84123", 2, 2, 1500, 5);
        assertEquals(2, condo1.getBaths());
    }

    @Test
    void testGetSize() {
        House house1 = new House("1125 S Atherton Dr", "84123", 3, 2, 2000, 0.5);
        assertEquals(2000.00, house1.getSize());
    }

    @Test
    void testSetBeds() {
        Condo condo1 = new Condo("1135 S Atherton Dr", "84123", 2, 2, 1500, 5);
        condo1.setBeds(3);
        assertEquals(3, condo1.getBeds());
    }

    @Test
    void testSetBaths() {
        House house1 = new House("1125 S Atherton Dr", "84123", 3, 2, 2000, 0.5);
        house1.setBaths(3);
        assertEquals(3, house1.getBaths());
    }

    @Test
    void testSetSize() {
        Condo condo1 = new Condo("1135 S Atherton Dr", "84123", 2, 2, 1500, 5);
        condo1.setSize(850.00);
        assertEquals(850.00, condo1.getSize(), 0.01);
    }

}
