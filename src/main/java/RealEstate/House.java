/*File: "House.java"
 * Lab 6i: Real Estate, Part 2—Abstraction and Appraisal
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin
 * Date: Feb 15, 2024
 * Description:
 * 		* Implement the inherited abstract method:
 * 				Line 44: calculateAppraisalPrice() Method
 * 		* Line 48: Use the described price information to calculate the Appraisal Price
 * 		* Line 58: Use the inherited setAppraisalPrice() Method to set the inherited attribute appraisalPrice to the price calculated
 * 		* Line 60: returns the value of the appraisalPrice Attribute.
 */

package RealEstate;

public class House extends Residential {

    //Attributes
    private double yardAcres;

    //Default Constructor
    public House() {
        super();
        yardAcres = 0;
    }

    //Constructor with One Parameter
    public House(String aStreetAddress, String aZip, int aBedCount, int aBathCount, double aSqFootage, double aYardAcres) {
        super(aStreetAddress, aZip, aBedCount, aBathCount, aSqFootage);
        yardAcres = aYardAcres;
    }

    //Getter Method
    public double getYardAcres() {
        return yardAcres;
    }

    //Setter method
    public void setYardAcres(int aYardAcres) {
        yardAcres = aYardAcres;
    }

    //Method override to calculate appraisal price for House
    public double calculateAppraisalPrice() {

        double appraisalPrice = 0.0;
        double pricePerSquareFt = 97.00;    // $97.00 per square foot
        double pricePerRoom = 10000.00;    // Additional $10,000.00 for each bedroom
        double pricePerBathroom = 12000.00;    // Additional $12,000.00 for each bathroom
        double pricePerYardAcres = 460000.00;    // Additional $460,000.00 per full acre yard

        appraisalPrice = pricePerSquareFt * super.getSize();
        appraisalPrice += pricePerRoom * super.getBeds();
        appraisalPrice += pricePerBathroom * super.getBaths();
        appraisalPrice += pricePerYardAcres * yardAcres;

        super.setAppraisalPrice(appraisalPrice); // Set the calculated appraisal using the inherited  setAppraisalPrice() from Property Class

        return appraisalPrice;
    }

}//END of House Class
