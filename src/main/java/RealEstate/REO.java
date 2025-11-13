/*File: "REO.java"
 * Lab 9i: Real Estate, Part 4—Listings Module
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin
 * Date: Mar 2, 2024
 * Description:
 * 		* Line 39: (You will add a static Listings field to your REO class that
 * 					  creates a new Listings object to store your listings in the
 * 					  HashMap defined in your Listings class.)
 *		* Line 283-319: Add a House: Query the user for all the data needed to create
 *						a House object and then display the Appraisal Price. After the
 *						Appraisal Price is displayed, ask the user for the List price
 *						and add the new House object to your Listings HashMap.
 *		* Line 322-356: Add a Condo: Query the user for all the data needed to create
 *						a Condo object and then display the Appraisal Price. After the
 *						Appraisal Price is displayed, ask the user for the List price
 *						and add the new Condo object to your Listings HashMap.
 * 		* Line 240-277: Auto Populate: Add the ability for a user to create several
 * 						hard-coded House and Condo objects and add them to your
 * 						Listings HashMap object for testing purposes.
 * 		* Line 211-240: Show Listings:
 * 					- Display all the listings in the HashMap object as shown in the Example Run.
 *
 */

package RealEstate;

import java.util.Collection;
import java.util.Scanner;


import java.util.Iterator;

class REO {

    private static final Listings listings = new Listings();

    public static void main(String[] args) {

        Scanner sIn = new Scanner(System.in);
        String choice;

        //Set the Store OPEN
        boolean closed = false;

        while (!closed) {

            System.out.println("\n-----------------------------------\n");
            System.out.println("             Main Menu                ");
            System.out.println("\n-----------------------------------\n");

            System.out.println("1: Listings");
            System.out.println("2: Bids");

            System.out.print("\nWhat would you like to do? (1-2): ");
            choice = sIn.nextLine();

            switch (choice) {
                case "1":
                    listingMenu(sIn);
                    break;
                case "2":
                    bidsMenu(sIn);
                    break;
                default:
                    System.out.println("Invalid response:  Please enter a choice from the menu (1-2)");
                    break;
            }//END of switch (choice)

        }//END of outer While loop for store open or closed

        //Close the Scanner
        sIn.close();

    }// END of main() Method

    //Method for switch case 1 "Listing Menu"
    private static void listingMenu(Scanner sIn) {

        String choice;
        boolean done = false;

        while (!done) {

            System.out.println("\n\n-----------------------------------\n");
            System.out.println("            Listing Menu               ");
            System.out.println("\n-----------------------------------\n");

            System.out.println("\n1: Add Listing");
            System.out.println("2: Show Listings");
            System.out.println("3: Auto Populate Listings (Dev tool)");
            System.out.println("ENTER: Exit back to the previous menu.");

            System.out.print("\nWhat would you like to do? (1-3): ");
            choice = sIn.nextLine();

            if (choice.equals("")) {
                done = true;
            } else {
                switch (choice) {
                    case "1":
                        addListingMenu(sIn);
                        break;
                    case "2":
                        showListings();
                        break;
                    case "3":
                        autoPopulateListings();
                        break;
                    default:
                        System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
                        break;
                }// END of switch (choice)

            }// END of if (choice.equals(""))

        }// END of while (!done)

    }// END of listingMenu() method


    //Method for switch case 2 "Bids Menu"
    private static void bidsMenu(Scanner sIn) {

        String choice;
        boolean done = false;

        while (!done) {

            System.out.println("\n\n-----------------------------------\n");
            System.out.println("              Bids Menu                ");
            System.out.println("\n-----------------------------------\n");

            System.out.println("\n1: Add New Bid");
            System.out.println("2: Show Existing Bids");
            System.out.println("3: Auto Populate Bids (Dev tool)");
            System.out.println("ENTER: Exit back to the previous menu.");

            System.out.print("\nWhat would you like to do? (1-3): ");
            choice = sIn.nextLine();

            if (choice.equals("")) {
                done = true;
            } else {
                switch (choice) {
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    default:
                        System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
                        break;
                }//end of switch (choice)

            }//end of if (choice.equals(""))

        }//end of while (!done)

    }//END of bidsMenu() method


    //Method for listingMenu switch case 1 "Add Listing"
    private static void addListingMenu(Scanner sIn) {

        String choice;
        boolean done = false;

        while (!done) {

            System.out.println("\n\n-----------------------------------\n");
            System.out.println("          Add Listing Menu             ");
            System.out.println("\n-----------------------------------\n");

            System.out.println("\n1: Add House");
            System.out.println("2: Add Condo");
            System.out.println("ENTER: Exit back to the previous menu.");

            System.out.print("\nWhat would you like to do? (1-2): ");
            choice = sIn.nextLine();

            if (choice.equals("")) {
                done = true;
            } else {
                switch (choice) {
                    case "1":
                        addHouse(sIn);
                        break;
                    case "2":
                        addCondo(sIn);
                        break;
                    default:
                        System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
                        break;
                }//end of switch (choice)

            }//end of if (choice.equals(""))

        }//end of while (!done)

    }//END of addListingMenu() method


    //Method for listingMenu switch case 2 "Show Listings"
    private static void showListings() {

        Collection<Residential> residences = listings.getResidences();

        System.out.println("\n\nCurrent Listings for REO:\n");

        if (residences.isEmpty()) {
            System.out.println("No listings available.");
        } else {
            int listingNumber = 1;

            // Get an iterator for the collection of residences
            Iterator<Residential> iterator = residences.iterator();

            // Iterate through the collection using a standard for loop
            for (int i = 0; i < residences.size(); i++) {
                Residential residence = iterator.next();

                // Print the listing number
                System.out.println("\nListing No: " + listingNumber);

                // Print the details using toString() method of Residential (House or Condo)
                System.out.println(residence.toString());

                listingNumber++;
            }//	END of for loop

        }//	END of if and else statement

    }//	END of showListings()


    //Method for listingMenu switch case 3 "Auto Populate Listings (Dev tool)"
    private static void autoPopulateListings() {

        int currentSize = listings.getListingCount();

        House house1 = new House("34 Elm", "95129", 3, 2, 2200, 0.2);
        house1.setListPrice(house1.calculateAppraisalPrice() * 1.1);
        listings.addListing("34 Elm", house1);

        House house2 = new House("42 Hitchhikers", "95136", 4, 3, 2800, 0.3);
        house2.setListPrice(house2.calculateAppraisalPrice() * 1.1);
        listings.addListing("42 Hitchhikers", house2);

        Condo condo1 = new Condo("4876 Industrial", "95177", 3, 1, 1800, 3);
        condo1.setListPrice(condo1.calculateAppraisalPrice() * 1.1);
        listings.addListing("4876 Industrial", condo1);

        House house3 = new House("2654 Oak", "84062", 5, 53, 4200, 0.5);
        house3.setListPrice(house3.calculateAppraisalPrice() * 1.1);
        listings.addListing("2654 Oak", house3);

        Condo condo2 = new Condo("9875 Lexington", "84063", 2, 1, 1500, 1);
        condo2.setListPrice(condo2.calculateAppraisalPrice() * 1.1);
        listings.addListing("9875 Lexington", condo2);

        Condo condo3 = new Condo("3782 Market", "84066", 3, 1, 1800, 2);
        condo3.setListPrice(condo3.calculateAppraisalPrice() * 1.1);
        listings.addListing("3782 Market", condo3);

        House house4 = new House("7608 Glenwood", "84055", 6, 3, 3900, 0.4);
        house4.setListPrice(house4.calculateAppraisalPrice() * 1.1);
        listings.addListing("7608 Glenwood", house4);

        House house5 = new House("1220 Apple", "84057", 8, 7, 7900, 1);
        house5.setListPrice(house5.calculateAppraisalPrice() * 1.1);
        listings.addListing("1220 Apple", house5);

        System.out.println("\n" + (listings.getListingCount() - currentSize) + " residences have been added to the listings for testing purposes.\n");
    }


    //Method for addHouse switch case 1 "Add House"
    private static void addHouse(Scanner sIn) {

        System.out.print("Please enter the street address for the residence: ");
        String address = sIn.nextLine();

        System.out.print("Please enter the zip code for the residence: ");
        String zipCode = sIn.nextLine();

        System.out.print("Please enter the number of bedrooms: ");
        int bedrooms = Integer.parseInt(sIn.nextLine());

        System.out.print("Please enter the number of bathrooms: ");
        int bathrooms = Integer.parseInt(sIn.nextLine());

        System.out.print("Please enter the square footage of the residence: ");
        double sqFootage = Double.parseDouble(sIn.nextLine());

        System.out.print("Please enter the size of the yard in acres: ");
        double yardSize = Double.parseDouble(sIn.nextLine());

        House house = new House(address, zipCode, bedrooms, bathrooms, sqFootage, yardSize);

        house.calculateAppraisalPrice();
        System.out.printf("\nAppraisal Price for this property is: $%,.2f\n", house.getAppraisalPrice());

        System.out.print("Please enter the List Price for the property: $");
        double listPrice = Double.parseDouble(sIn.nextLine());

        house.setListPrice(listPrice);

        listings.addListing(address, house);

        System.out.println("\nYou have created a new listing!\n");

        System.out.println(house.toString());

    }

    //Method for addCondo switch case 1 "Add Condo"
    private static void addCondo(Scanner sIn) {

        System.out.print("Please enter the street address for the residence: ");
        String address = sIn.nextLine();

        System.out.print("Please enter the zip code for the residence: ");
        String zipCode = sIn.nextLine();

        System.out.print("Please enter the number of bedrooms: ");
        int bedrooms = Integer.parseInt(sIn.nextLine());

        System.out.print("Please enter the number of bathrooms: ");
        int bathrooms = Integer.parseInt(sIn.nextLine());

        System.out.print("Please enter the square footage of the residence: ");
        double sqFootage = Double.parseDouble(sIn.nextLine());

        System.out.print("Please enter the floor level of the condo: ");
        int floorLevel = Integer.parseInt(sIn.nextLine());

        Condo condo = new Condo(address, zipCode, bedrooms, bathrooms, sqFootage, floorLevel);

        condo.calculateAppraisalPrice();
        System.out.printf("\nAppraisal Price for this property is: $%,.2f\n", condo.getAppraisalPrice());

        System.out.print("Please enter the List Price for the property: $");
        double listPrice = Double.parseDouble(sIn.nextLine());

        condo.setListPrice(listPrice);

        listings.addListing(address, condo);

        System.out.println("\nYou have created a new listing!\n");

        System.out.println(condo.toString());

    }

}//END of class REO
