/*File: "REO.java"
 * Lab 8i: Real Estate, Part 3—Menu System
 * Author: Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin
 * Date: Mar 2, 2024
 * Description:
 * 		* Implement a user interface with helper methods for the Real Estate Office
 * 		* Line 34-64: The Main Menu will have the following options:
 *					Listings
 *					Bids
 *		* Line 72-111: The Listings Menu will have the following options:
 *					Add Listing
 *					Show Listings
 *					Auto Populate Listings (Dev tool)
 *		* Line 157-192: The Add Listing Menu will have the following options:
 *					Add House
 *					Add Condo
 * 		* Line 115-153: The Bids Menu will have the following options:
 *					Add New Bid
 *					Show Existing Bids
 *					Auto Populate Bids (Dev Tool)
 */

package RealEstate;

import java.util.Scanner;

class REO {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

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
                        break;
                    case "3":
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
                        break;
                    case "2":
                        break;
                    default:
                        System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
                        break;
                }//end of switch (choice)

            }//end of if (choice.equals(""))

        }//end of while (!done)

    }//END of addListingMenu() method

}//END of class REO
