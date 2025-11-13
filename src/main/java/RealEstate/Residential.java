/*File: "Residential.java"
 * Lab 11i: Real Estate, Part 5—Bids Module
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin
 * Date: Apr 2, 2024
 * Description:
 * 		* Line 17: Implemented Biddable Interface
 * 		* Line 75-118: Override Biddable methods
 */

package RealEstate;

import java.util.HashMap;
import java.util.Set;

public abstract class Residential extends Property implements Biddable {

    //Attributes
    private int bedCount;
    private int bathCount;
    private double sqFootage;

    private HashMap<String, Double> bids;

    //Default Constructor
    public Residential() {
        super();
        bedCount = 0;
        bathCount = 0;
        sqFootage = 0.0;
        bids = new HashMap<>();

    }

    //Constructor with One Parameter
    public Residential(String aStreetAddress, String aZip, int aBedCount, int aBathCount, double aSqFootage) {
        super(aStreetAddress, aZip);
        bedCount = aBedCount;
        bathCount = aBathCount;
        sqFootage = aSqFootage;
        bids = new HashMap<>();
    }

    //Getter Methods
    public int getBeds() {
        return bedCount;
    }

    public int getBaths() {
        return bathCount;
    }

    public double getSize() {
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

    // Abstract method to calculate appraisal price (implemented by subclasses)
    public abstract double calculateAppraisalPrice();


    //OVERRIDES

    /**
     * Gets the bids associated with this residential property.
     *
     * @return A HashMap containing bidder names as keys and bid amounts as values.
     */
    public HashMap<String, Double> getBids() {
        return bids;
    }

    /**
     * Gets the bid amount for a specific bidder.
     *
     * @param bidderName The name of the bidder.
     * @return The bid amount associated with the bidder.
     */
    public Double getBid(String bidderName) {
        return bids.get(bidderName);
    }

    /**
     * Gets the set of bidders who have placed bids on this property.
     *
     * @return A Set containing the names of all bidders.
     */
    public Set<String> getBidders() {
        return bids.keySet();
    }

    /**
     * Gets the total count of bids placed on this property.
     *
     * @return The number of bids.
     */
    public int getBidCount() {
        return bids.size();
    }

    /**
     * Adds a new bid to this property.
     * If the bidder already exists, updates the bid amount; otherwise, adds a new bidder with the bid amount.
     *
     * @param bidderName The name of the bidder.
     * @param bidAmount  The amount of the bid.
     */
    public void newBid(String bidderName, Double bidAmount) {
        bids.put(bidderName, bidAmount);
    }

}//END of Residential Class
