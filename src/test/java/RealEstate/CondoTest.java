/*File: "CondoTest.java"
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

class CondoTest {

    @Test
    void testGetFloorLvl() {
        Condo c1 = new Condo("4420 S Atherton Dr", "84123", 2, 1, 750.00, 3);
        assertEquals(3, c1.getFloorLvl());
    }

    @Test
    void testSetFloorLvl() {
        Condo c1 = new Condo("4420 S Atherton Dr", "84123", 2, 1, 750.00, 3);
        c1.setFloorLvl(2);
        assertEquals(2, c1.getFloorLvl());
    }

    @Test
    void testCalculateAppraisalPrice() {
        Condo condo1 = new Condo("1135 S Atherton Dr", "84123", 2, 2, 1500, 5);
        condo1.calculateAppraisalPrice();
        assertEquals(193000.00, condo1.getAppraisalPrice(), 0.01);
    }

}//END of CondoTest
