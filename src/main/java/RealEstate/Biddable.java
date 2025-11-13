
/*File: "Biddable.java"
 * Lab 11i: Real Estate, Part 5—Bids Module
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin
 * Date: Apr 2, 2024
 * Description:
 * 		* Line 16: Biddable interface to be used by Residential.java
 */

package RealEstate;

import java.util.HashMap;
import java.util.Set;

public interface Biddable {
    /*
     * Contains a list of bidder names (key) and their associated bid (value).
     * */
    public HashMap<String, Double> getBids();

    /*
     * Takes a String argument and returns the Double value for the associated String key in a HashMap<String, Double>.
     * */
    public Double getBid(String bidderName);

    /*
     * Takes no arguments and returns a Set<String> of keys from a HashMap<String, Double>
     * */
    public Set<String> getBidders();

    /*
     * Takes no arguments and returns the number of bids in the HashMap<String, Double>
     * */
    public int getBidCount();

    /*
     * Returns void. Either updates the value for the key or adds a new key/value pair in a HashMap<String, Double>
     * */
    public void newBid(String bidderName, Double bidAmount);

}
