/*File: "Listable.java"
 * Lab 9i: Real Estate, Part 4—Listings Module
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin
 * Date: Mar 18, 2024
 * Description:
 * 		* Created methods that will be overridden in class implementations
 */

package RealEstate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public interface Listable {

    /**
     * Takes no arguments
     * Returns a HashMap<String, Residential> containing a list of street addresses (key) and their associated residences (value)
     */
    public HashMap<String, Residential> getListings();

    /**
     * Takes a String argument
     * Returns the Residential value for the associated String key in a HashMap<String, Residential>
     */
    public Residential getListings(String address);

    /**
     * Takes no arguments
     * Returns a Set<String> of keys from a HashMap<String, Residential>
     */
    public Set<String> getStreetAddresses();

    /**
     * Takes no arguments
     * Returns a Collection<Residential> of values from a HashMap<String, Residential>
     */
    public Collection<Residential> getResidences();

    /**
     * Takes no arguments
     * Returns the number of listings in the HashMap<String, Residential>
     */
    public int getListingCount();

    /**
     * Returns void
     * Adds a new key/value pair in a HashMap<String, Residential>
     */
    public void addListing(String address, Residential residence);

}//	END of Listable Interface
