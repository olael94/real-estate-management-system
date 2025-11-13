/*File: "PropertyTest.java"
 * Lab 6i: Real Estate, Part 2—Abstraction and Appraisal
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin
 * Date: Feb 15, 2024
 * Description:
 * 		* Create test cases for the follwoing getters and setters:
 * 				getListPrice()
 * 				getAppraisalPrice()
 * 				setListPrice()
 * 				setAppraisalPrice()s
 *
 */

package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PropertyTest {

    @Test
    void testGetStreetAddress() {
        House house1 = new House("1125 S Atherton Dr", "84123", 3, 2, 2000, 0.5);
        assertEquals("1125 S Atherton Dr", house1.getStreetAddress());
    }

    @Test
    void testGetZip() {
        Condo condo1 = new Condo("1135 S Atherton Dr", "84123", 2, 2, 1500, 5);
        assertEquals("84123", condo1.getZip());
    }

    @Test
    void testSetStreetAddress() {
        House house1 = new House("1125 S Atherton Dr", "84123", 3, 2, 2000, 0.5);
        house1.setStreetAddress("4420 S Atherton Dr");
        assertEquals("4420 S Atherton Dr", house1.getStreetAddress());
    }

    @Test
    void testSetZip() {
        Condo condo1 = new Condo("1135 S Atherton Dr", "84123", 2, 2, 1500, 5);
        condo1.setZip("84124");
        assertEquals("84124", condo1.getZip());
    }

    //New Test Cases for created methods
    @Test
    void testGetListPrice() {
        House house1 = new House("1125 S Atherton Dr", "84123", 3, 2, 2000, 0.5);
        house1.setListPrice(300000);
        assertEquals(300000.00, house1.getListPrice(), 0.01);
    }

    @Test
    void testSetListPrice() {
        Condo condo1 = new Condo("1135 S Atherton Dr", "84123", 2, 2, 1500, 5);
        condo1.setListPrice(200000);
        assertEquals(200000.00, condo1.getListPrice(), 0.01);
    }

    @Test
    void testGetAppraisalPrice() {
        House house1 = new House("1125 S Atherton Dr", "84123", 3, 2, 2000, 0.5);
        house1.setAppraisalPrice(350000);
        assertEquals(350000.00, house1.getAppraisalPrice(), 0.01);
    }

    @Test
    void testSetAppraisalPrice() {
        Condo condo1 = new Condo("1135 S Atherton Dr", "84123", 2, 2, 1500, 5);
        condo1.setAppraisalPrice(250000);
        assertEquals(250000.00, condo1.getAppraisalPrice(), 0.01);
    }

}
