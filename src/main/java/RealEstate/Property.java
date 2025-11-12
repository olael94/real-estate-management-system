/*File: "Property.java"
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Feb 3, 2024
 * Description:
 * 		* Add Attributes
 * 		* Add Default Constructor and Parameters constructor
 * 		* Add Getter and Setter methods  
 */

package RealEstate;

public class Property {
	
	//Attributes
	private String streetAddress;
	private String zip;

	//Default Constructor
	public Property() {
		streetAddress = "";
		zip = "";
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

	//Setter methods
	public void setStreetAddress(String aStreetAddress) {
		streetAddress = aStreetAddress;
	}

	public void setZip(String aZip) {
		zip = aZip;
	}

}//END of property Class
