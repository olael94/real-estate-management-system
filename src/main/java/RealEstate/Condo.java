/*File: "Condo.java"
 * Lab 9i: Real Estate, Part 4—Listings Module
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin
 * Date: Mar 18, 2024
 * Description:
 * 		* Line 60-89: Override the toString() method to print instances in REO class
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

    public String toString() {

        String line1Pt1 = String.format("Residence Type: Condo");
        String line1Pt2 = String.format("Address: %s", getStreetAddress());
        String line1Pt3 = String.format("Zip Code: %s", getZip());

        String line2 = String.format("Sq Footage: %d", (int) getSize());
        String line3 = String.format("Bedrooms: %d", getBeds());
        String line4 = String.format("Bathrooms: %d", getBaths());
        String line5 = String.format("Floor: %d", getFloorLvl());

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

}//END of Condo Class
