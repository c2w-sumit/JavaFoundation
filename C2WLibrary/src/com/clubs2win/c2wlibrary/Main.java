package com.clubs2win.c2wlibrary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        while (true) {
            System.out.println("\n\nPlease select an option:");
            System.out.println("1 - Print Catalog");
            System.out.println("2 - Checkout");
            System.out.println("3 - Return");
            System.out.println("4 - List currently checked out items");
            System.out.println("9 - End Program");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printCatalog(false); //all items
                    break;
                case 2:
                    checkout();
                    break;
                case 3:
                    checkin();
                    break;
                case 4:
                    printCatalog(true); //only checked out items
                    break;
                case 9:
                    System.out.println("Thank you for using the C2W Library. PLease come again!");
                    return;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }
        }
    }

    public static void printCatalog(boolean onlyCheckedOut)
    {
        LibrarySystem librarySystem = LibrarySystem.getInstance();
        ArrayList libraryCollection = librarySystem.getLibraryCatalog();

        Iterator<Object> iterator = libraryCollection.iterator();
        int i=0;
        while (iterator.hasNext())
        {
            LibraryItem item = (LibraryItem)iterator.next();
            if (item.isCheckedOut() || (onlyCheckedOut == false))
            {
                System.out.print("Item# " + i + " ");
                System.out.println(item);
            }
            i++;
        }
    }

    public static void checkout()
    {
	    // write your code here
        LibrarySystem librarySystem = LibrarySystem.getInstance();
        ArrayList libraryCollection = librarySystem.getLibraryCatalog();

        Iterator<Object> iterator = libraryCollection.iterator();
        int i=0;
        while (iterator.hasNext())
        {
            System.out.print("Item# " + i + " ");
            System.out.println(iterator.next());
            i++;
        }

        System.out.println("Please enter Item# to checkout");
        Scanner scanner = new Scanner(System.in);
        int itemtoCheckOut = scanner.nextInt();

        LibraryItem libraryItem = (LibraryItem)libraryCollection.get(itemtoCheckOut);
        boolean success =  libraryItem.CheckoutItem();

        if (success)
        {
            System.out.println("Checkout successful!");
            System.out.println("Item checked out:");
            System.out.println(libraryItem);
            System.out.println("Loan expiration date is " + libraryItem.getExpirationDate());
        }
    }

    public static void checkin()
    {
        // write your code here
        LibrarySystem librarySystem = LibrarySystem.getInstance();
        ArrayList libraryCollection = librarySystem.getLibraryCatalog();

        Iterator<Object> iterator = libraryCollection.iterator();
        int i=0;
        while (iterator.hasNext())
        {
            LibraryItem item = (LibraryItem)iterator.next();
            if (item.isCheckedOut())
            {
                System.out.print("Item# " + i + " ");
                System.out.println(item);
            }
            i++;
        }

        System.out.println("Please enter Item# to return");
        Scanner scanner = new Scanner(System.in);
        int itemtoCheckIn = scanner.nextInt();

        LibraryItem libraryItem = (LibraryItem)libraryCollection.get(itemtoCheckIn);
        boolean success =  libraryItem.CheckinItem();

        if (success)
        {
            System.out.println("Return successful!");
            System.out.println("Item returned:");
            System.out.println(libraryItem);
        }
    }
}

