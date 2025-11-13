/*File: "House.java"
 * Lab 9i: Real Estate, Part 4—Listings Module
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin
 * Date: Mar 18, 2024
 * Description:
 * 		* Line 59-88: Override the toString() method to print instances in REO class
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

    public String toString() {

        String line1Pt1 = String.format("Residence Type: House");
        String line1Pt2 = String.format("Address: %s", getStreetAddress());
        String line1Pt3 = String.format("Zip Code: %s", getZip());

        String line2 = String.format("Sq Footage: %d", (int) getSize());
        String line3 = String.format("Bedrooms: %d", getBeds());
        String line4 = String.format("Bathrooms: %d", getBaths());
        String line5 = String.format("Yard Size (Acres): %,.2f", getYardAcres());

        String line6 = String.format("Appraisal Price: $%,.2f", getAppraisalPrice());
        String line7 = String.format("List Price: $%,.2f", getListPrice());

        String line1 = String.format("%-30s%-35s%-30s", line1Pt1, line1Pt2, line1Pt3);

        return "\n" +
                "-------------------------------------------------------------------------------------------------------\n" +
                line1 + "\n" +
                "-------------------------------------------------------------------------------------------------------\n" +
                line2 + "\n" +
                line3 + "\n" +
                line4 + "\n" +
                line5 + "\n" +
                "----------------------------------------\n" +
                line6 + "\n" +
                line7 + "\n" +
                "----------------------------------------\n";

    }

}//END of House Class
