/*File: "REO.java"
 * Lab 11i: Real Estate, Part 5—Bids Module
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin
 * Date: Apr 2, 2024
 * Description:
 * 		* Line 303-380: Add Bids:
 *						• You will need to list all the existing Residential objects
 *						in the Listings map in a menu so your user can choose to which
 *						property a bid will be added. Your menu should show how many
 *						existing bids are already associated with each property.
 *						• Once the user selects a property from the list, display the
 *						details for that property along with a prompt to enter the
 *						bidder's name and new bid amount.
 *
 *		* Line 383-454: Show Bids:
 *						•You will need to list all the existing Residential objects in
 *						the Listings map in a menu so your user can choose for which
 *						property to show bids. Your menu should show how many existing bids
 *						are associated with each property.
 *						• Once the user selects a property from the list, display the details
 *						for that property, along with a list of all existing bids with the
 *						bidder's name and amount.
 *
 * 		* Line 240-277: Auto-Populate:
 * 						• Add the ability for a user to create several bids for each Residential
 * 						object in the Listing HashMap for testing purposes. Base the bid amount
 * 						on the calculated appraisal price for each property.
 *						• The NUMBER of bids for each property in the listings must be random.
 *						Use the random module to determine how many bids each property will get.
 *						Pick a random number between two and 10 for each property.
 *						• The BID amount must be different for each bid. To calculate a bid, choose
 *						a random number between -10% and +10% of the Appraisal Price of the property
 *						and use that number for the bid. Each bidder will then have a different dib
 *						for the property.
 *
 */

package RealEstate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import java.util.Iterator;

class REO {

    private static final Listings listings = new Listings();

    // HashMap to store bids for each property
    private static final HashMap<String, HashMap<String, Double>> propertyBids = new HashMap<>();

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
                        addNewBid(sIn);
                        break;
                    case "2":
                        showExistingBids(sIn);
                        break;
                    case "3":
                        autoPopulateBids();
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


    //Method for Bids Menu case 1 "Add New Bid"
    private static void addNewBid(Scanner sIn) {

        // Create an infinite loop for the bidding process
        while (true) {

            // Initialize a variable to keep track of the listing number
            int listingNumber = 1;

            // Display header for current property listings with bids
            System.out.println("\nCurrent Listings for REO:");
            System.out.println("No.      Property (bids)");
            System.out.println("---------------------------");

            // Iterate through each property listing in the listings map
            for (Map.Entry<String, Residential> entry : listings.getListings().entrySet()) {

                // Get the key of the current property
                String propertyKey = entry.getKey();

                // Retrieve or create a bids map for the current property
                HashMap<String, Double> bidsMap = propertyBids.getOrDefault(propertyKey, new HashMap<>());

                // Get the number of bids for the current property
                int numBids = bidsMap.size();

                // Display the listing number, property key, and number of bids
                System.out.println(listingNumber + ": " + propertyKey + " (" + numBids + ")");
                listingNumber++;
            }

            // Prompt the user to choose a property to add a bid or exit
            System.out.print("ENTER: Exit back to the previous menu.");
            System.out.print("\\n\\nFor which property would you like to add a bid?: ");
            String userInput = sIn.nextLine();

            // Check if the user input is empty (Exit back to the previous menu)
            if (userInput.isEmpty()) {
                return;
            }

            // Convert the user input to an integer for property selection
            int propertyChoice = Integer.parseInt(userInput);

            // Check if the property choice is valid
            if (propertyChoice >= 1 && propertyChoice < listingNumber) {

                // Get the selected property key based on the user's choice
                String selectedPropertyKey = (String) listings.getStreetAddresses().toArray()[propertyChoice - 1];

                // Get the selected property object using the selected property key
                Residential selectedProperty = listings.getListings(selectedPropertyKey);

                // Display property details
                System.out.println(selectedProperty.toString());

                // Prompt for bidder's name and new bid amount
                System.out.print("\nPlease enter the name of the bidder: ");
                String bidderName = sIn.nextLine();

                System.out.print("Please enter the new bid: $");
                double bidAmount = Double.parseDouble(sIn.nextLine());

                // Retrieve or create a bids map for the selected property
                HashMap<String, Double> bidsMap = propertyBids.getOrDefault(selectedPropertyKey, new HashMap<>());
                // Add the new bid to the bids map for the selected property
                bidsMap.put(bidderName, bidAmount);
                // Update the propertyBids map with the updated bids map for the selected property
                propertyBids.put(selectedPropertyKey, bidsMap);

                // Print a message indicating the new bid was added successfully
                System.out.println("\nNew bid for property '" + selectedPropertyKey + "' added.\n");
            } else {
                System.out.println("\nInvalid property choice.\n");
            }
        }
    }

    //Method for Bids Menu case 2 "Show Existing Bids"
    private static void showExistingBids(Scanner sIn) {
        while (true) {

            // Initialize a variable to keep track of the listing number
            int listingNumber = 1;

            // Display header for current property listings with bids
            System.out.println("\nCurrent Listings for REO:\n");

            // Iterate through each property listing in the listings map
            for (Map.Entry<String, Residential> entry : listings.getListings().entrySet()) {

                // Get the key of the current property
                String propertyKey = entry.getKey();
                // Retrieve or create a bids map for the current property
                HashMap<String, Double> bidsMap = propertyBids.getOrDefault(propertyKey, new HashMap<>());
                // Get the number of bids for the current property
                int numBids = bidsMap.size();

                // Display the listing number, property key, and number of bids
                System.out.println(listingNumber + ": " + propertyKey + " (" + numBids + ")");
                listingNumber++;
            }

            // Prompt the user to choose a property to view bids or exit
            System.out.print("ENTER: Exit back to the previous menu.");
            System.out.print("\\n\\nFor which property would you like to add a bid?: ");
            String userInput = sIn.nextLine();

            // Check if the user input is empty (Exit back to the previous menu)
            if (userInput.isEmpty()) {
                return;
            }

            // Convert the user input to an integer for property selection
            int propertyChoice = Integer.parseInt(userInput);

            // Check if the property choice is valid
            if (propertyChoice >= 1 && propertyChoice < listingNumber) {

                // Get the selected property key based on the user's choice
                String selectedPropertyKey = (String) listings.getStreetAddresses().toArray()[propertyChoice - 1];
                // Get the selected property object using the selected property key
                Residential selectedProperty = listings.getListings(selectedPropertyKey);

                // Display property details
                System.out.println(selectedProperty.toString());

                // Display existing bids for the property
                System.out.println("\nCurrent bids for this listing:");
                System.out.println("---------------------------------------");
                System.out.println("      Bidder              Bid");
                System.out.println("---------------------------------------");

                // Retrieve or create a bids map for the selected property
                HashMap<String, Double> bidsMap = propertyBids.getOrDefault(selectedPropertyKey, new HashMap<>());

                // Iterate through existing bids and print each bidder and bid amount
                for (Map.Entry<String, Double> bid : bidsMap.entrySet()) {

                    System.out.printf("%-25s $%.2f%n", bid.getKey(), bid.getValue());

                }
            } else {

                System.out.println("\nInvalid property key. Please select a valid property.\n");

            }
        }
    }

    //Method for Bids Menu case 3 " Auto Populate Bids (Dev tool)"
    private static void autoPopulateBids() {

        //variables
        Random random = new Random();

        //Array of Random Bidders
        String[] autoBidders = {"Patric Stewart", "Walter Koenig", "William Shatner", "Leonard Nimoy", "DeForect Kelley",
                "James Doohan", "George Takei", "Majel Barrett", "Nichelle Nichol", "Jonathan Frank", "Marina Sirtis",
                "Brent Spiner", "Gates McFadden", "Michael Dorn", "LeVar Burton", "Wil Wheaton", "Colm Meaney", "Michelle Forbes"};

        // Iterate through each residential property in the listings
        for (Residential property : listings.getResidences()) {
            // Get a random number of bids between 2 and 10
            int numBids = random.nextInt(9) + 2;

            // Generate random bids for the property
            for (int i = 0; i < numBids; i++) {
                // Select a random bidder from autoBidders array
                int index = random.nextInt(autoBidders.length);
                String bidderName = autoBidders[index];

                // Generate a random bid amount within the bid range
                double minBidRange = property.calculateAppraisalPrice() * 0.9;
                double maxBidRange = property.calculateAppraisalPrice() * 1.1;
                double bidAmount = minBidRange + (maxBidRange - minBidRange) * random.nextDouble();

                // Add the bid to the propertyBids map
                HashMap<String, Double> bidsMap = propertyBids.getOrDefault(property.getStreetAddress(), new HashMap<>());
                bidsMap.put(bidderName, bidAmount);
                propertyBids.put(property.getStreetAddress(), bidsMap);
            }

            // Print the number of new bids added to each property
            System.out.println("\n");
            System.out.println(numBids + " new bids have been added to listing " + property.getStreetAddress() + ".");
        }
    }


    //Method for Add Listing Menu switch case 1 "Add House"
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

    //Method for Add Listing Menu switch case 2 "Add Condo"
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
