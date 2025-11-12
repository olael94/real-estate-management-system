/*File: "Residential.java"
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Feb 3, 2024
 * Description:
 * 		* Add Attributes
 * 		* Add Default Constructor
 * 		* Add Parameters constructor calling super class Property parameters
 * 		* Add Getter and Setter methods  
 */

package RealEstate;

public class Residential extends Property {

	//Attributes
	private int bedCount;
	private int bathCount;
	private double sqFootage;

	//Default Constructor
	public Residential() {
		super();
		bedCount = 0;
		bathCount = 0;
		sqFootage = 0.0;

	}

	//Constructor with One Parameter
	public  Residential(String aStreetAddress, String aZip,int aBedCount, int aBathCount, double aSqFootage) {
		super(aStreetAddress, aZip);
		bedCount = aBedCount;
		bathCount = aBathCount;
		sqFootage = aSqFootage;
	}

	//Getter Methods
	public int getBeds(){
		return bedCount;
	}	

	public int getBaths(){
		return bathCount;
	}
	
	public double getSize(){
		return sqFootage;
	}

	//Setter methods
	public void setBeds(int aBedCount) {
		bedCount = aBedCount;
	}

	public void setBaths(int aBathCount) {
		bathCount = aBathCount;
	}
	
	public void setSize(double aSqFootage) {
		sqFootage = aSqFootage;
	}

}
