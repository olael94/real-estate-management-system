/*File: "Listings.java"
 * Lab 9i: Real Estate, Part 4—Listings Module
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin
 * Date: Mar 18, 2024
 * Description:
 * 		* Line 20: Implements Listable interface
 * 		* Line 23: Has a single attribute called listings of type HashMap<String, Residential>.
 * 		* Line 26-28: Has a no-argument (default) constructor that creates a new listings HashMap<String, Residential>
 * 		* Line 32-60: Overrides Listable methods
 */

package RealEstate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Listings implements Listable {

    //Attributes
    private HashMap<String, Residential> listings;

    //Constructor
    public Listings() {
        listings = new HashMap<>();
    }

    //Overrides

    // Get the entire listings HashMap
    public HashMap<String, Residential> getListings() {
        return listings;
    }

    // Get a specific listing by its address
    public Residential getListings(String address) {
        return listings.get(address);
    }

    // Get a set of all street addresses in the listings
    public Set<String> getStreetAddresses() {
        return listings.keySet();
    }

    // Get a collection of all residences in the listings
    public Collection<Residential> getResidences() {
        return listings.values();
    }

    // Get the total count of listings
    public int getListingCount() {
        return listings.size();
    }

    // Add a new listing to the listings HashMap
    public void addListing(String address, Residential residence) {
        listings.put(address, residence);
    }

}//	END of Listings Class
