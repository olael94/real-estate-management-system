/*File: "Property.java"
 * Lab 6i: Real Estate, Part 2—Abstraction and Appraisal
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin
 * Date: Feb 15, 2024
 * Description:
 * 		* Make the Property class an abstract class.
 * 		* Add two attributes to the class:
				Line 29: double listPrice and
				Line 30: double appraisalPrice.
 * 		* Set the new attributes in the default constructor to 0, Do not include them in the parameters constructor
 * 		* Add the Getter and setter methods:
 * 				Line 55: getListPrice()
 * 				Line 72: setListPrice()
 * 				Line 59: getAppraisalPrice()
 * 				Line 77: setAppraisalPrice() --> Make this a protected method that can only be used by subclasses of the property class
 * 		*Add an abstract method to the class:
 * 				Line 83: calculateAppraisalPrice()
 */

package RealEstate;

public abstract class Property {

    //Attributes
    private String streetAddress;
    private String zip;
    private double listPrice;
    private double appraisalPrice;

    //Default Constructor
    public Property() {
        streetAddress = "";
        zip = "";
        listPrice = 0;
        appraisalPrice = 0;
    }

    //Constructor with Two Parameters
    public Property(String aStreetAddress, String aZip) {
        streetAddress = aStreetAddress;
        zip = aZip;
    }

    //Getter Methods
    public String getStreetAddress(){
        return streetAddress;
    }

    public String getZip(){
        return zip;
    }

    public double getListPrice(){
        return listPrice;
    }

    public double getAppraisalPrice(){
        return appraisalPrice;
    }

    //Setter methods
    public void setStreetAddress(String aStreetAddress) {
        streetAddress = aStreetAddress;
    }

    public void setZip(String aZip) {
        zip = aZip;
    }

    public void setListPrice(double aListPrice) {
        listPrice = aListPrice;
    }

    // Protected method to set appraisalPrice (accessible by subclasses)
    protected void setAppraisalPrice(double anAppraisalPrice) {
        appraisalPrice = anAppraisalPrice;
    }

    // Abstract method to calculate appraisal price (implemented by subclasses)
    public abstract double calculateAppraisalPrice();

}//END of property Class
