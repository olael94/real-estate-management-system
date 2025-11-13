/*File: "HouseTest.java"
 * Lab 6i: Real Estate, Part 2—Abstraction and Appraisal
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin
 * Date: Feb 15, 2024
 * Description:
 * 		* Create test cases for the new overridden calculateAppraisalPrice() Method.
 */

package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseTest {

    @Test
    void testGetYardAcres() {
        House h1 = new House("4420 S Atherton Dr", "84123", 2, 1, 750.00, 10.00);
        assertEquals(10.00, h1.getYardAcres(), 0.01);
    }

    @Test
    void testSetYardAcres() {
        House h1 = new House("4420 S Atherton Dr", "84123", 2, 1, 750.00, 10.00);
        h1.setYardAcres(15);
        assertEquals(15, h1.getYardAcres(), 0.01);
    }

    @Test
    void testCalculateAppraisalPrice() {
        House house1 = new House("1125 S Atherton Dr", "84123", 3, 2, 2000, 0.5);
        house1.calculateAppraisalPrice();
        assertEquals(478000.00, house1.getAppraisalPrice(), 0.01);
    }

}//END of HouseTest
