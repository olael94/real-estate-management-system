/*File: "Condo.java"
 * Lab 6i: Real Estate, Part 2—Abstraction and Appraisal
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin
 * Date: Feb 15, 2024
 * Description:
 * 		* Implement the inherited abstract method:
 * 				Line 45: calculateAppraisalPrice() Method
 * 		* Line 49: Use the described price information to calculate the Appraisal Price
 * 		* Line 59: Use the inherited setAppraisalPrice() Method to set the inherited attribute appraisalPrice to the price calculated
 * 		* Line 61: returns the value of the appraisalPrice Attribute.
 */

package RealEstate;

public class Condo extends Residential {

    //Attributes
    private int floorLvl;

    //Default Constructor
    public Condo() {
        super();
        floorLvl = 0;
    }

    //Constructor with One Parameter
    public Condo(String aStreetAddress, String aZip, int aBedCount, int aBathCount, double aSqFootage, int aFloorLvl) {
        super(aStreetAddress, aZip, aBedCount, aBathCount, aSqFootage);
        floorLvl = aFloorLvl;
    }

    //Getter Method
    public int getFloorLvl() {
        return floorLvl;
    }

    //Setter method
    public void setFloorLvl(int aFloorLvl) {
        floorLvl = aFloorLvl;
    }

    // Method to calculate appraisal price for Condo
    public double calculateAppraisalPrice() {

        double appraisalPrice = 0.0;

        double pricePerSquareFt = 88.00;    // $88.00 per square foot
        double pricePerRoom = 8000.00;    // Additional $8,000.00 for each bedroom
        double pricePerBathroom = 10000.00;    // Additional $10,000.00 for each bathroom
        double pricePerAdditionalFloorLvl = 5000.00;    // Additional $5,000.00 per floor level above level 1

        appraisalPrice = pricePerSquareFt * super.getSize();
        appraisalPrice += pricePerRoom * super.getBeds();
        appraisalPrice += pricePerBathroom * super.getBaths();
        appraisalPrice += pricePerAdditionalFloorLvl * floorLvl;

        super.setAppraisalPrice(appraisalPrice); // Set the calculated appraisal using the inherited  setAppraisalPrice() from Property Class

        return appraisalPrice;
    }

}//END of Condo Class
