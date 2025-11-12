/*File: "House.java"
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Feb 3, 2024
 * Description:
 * 		* Add Attributes
 * 		* Add Default Constructor
 * 		* Add Parameters constructor calling super class Residential and inherited Property parameters
 * 		* Add Getter and Setter methods  
 */

package RealEstate;

public class House extends Residential{

	//Attributes
	private double yardAcres;

	//Default Constructor
	public House() {
		super();
		yardAcres = 0;
	}

	//Constructor with One Parameter
	public  House(String aStreetAddress, String aZip,int aBedCount, int aBathCount, double aSqFootage, double aYardAcres) {
		super(aStreetAddress, aZip, aBedCount, aBathCount, aSqFootage);
		yardAcres = aYardAcres;
	}

	//Getter Method
	public double getYardAcres(){
		return yardAcres;
	}	

	//Setter method
	public void setYardAcress(int aYardAcres) {
		yardAcres = aYardAcres;
	}

}
