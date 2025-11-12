/*File: "Condo.java"
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

public class Condo extends Residential{

	//Attributes
	private int floorLvl;

	//Default Constructor
	public Condo() {
		super();
		floorLvl = 0;
	}

	//Constructor with One Parameter
	public  Condo(String aStreetAddress, String aZip,int aBedCount, int aBathCount, double aSqFootage, int aFloorLvl) {
		super(aStreetAddress, aZip, aBedCount, aBathCount, aSqFootage);
		floorLvl = aFloorLvl;
	}

	//Getter Method
	public int getFloorLvl(){
		return floorLvl;
	}	

	//Setter method
	public void setFloorLvl(int aFloorLvl) {
		floorLvl = aFloorLvl;
	}

}
