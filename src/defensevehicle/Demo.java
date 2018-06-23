/**
 * Copyright © 2018
 * Steven Anderson
 * All rights reserved
 * 
 * Homework 4 - Defense Vehicles
 * Demo.java - Class that contains Main used to demonstrate other objects 
 * 06/20/2018
 */

package defensevehicle;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// Create 2 Destroyers
		Destroyer defaultDestroyer = new Destroyer();
		System.out.println("***Creating Destroyer with Invalid Missiles.  Warning message expected***");
		Destroyer userDefinedDestroyer = new Destroyer(50, 40, "Steven's Destroyer", "Not as Fast", -1000);
		System.out.println();
		
		// Create 2 Submarines
		Submarine annapolisSubmarine = new Submarine(110, 25, "Annapolis", "SSN-760", 4);
		System.out.println("***Creating Submarine with Invalid Information. Warning message expected***");
		Submarine invalidSubmarine = new Submarine(-5, -2, "Bad values used", "Default Type", -5);
		// Also, in your test class, you should exercise your exception handling 
		// case for the submarine by setting the number of torpedoes in one of your submarine classes to the string "Foo".
		System.out.println();
		System.out.println("***Setting number of torpedos to 'Foo'. Warning message expected***");
		invalidSubmarine.setNumberTorpedos("Foo");
		System.out.println();

		// Make a collection of Destroyers (you select the type of Collection)		
		// S. Anderson: I prefer Lists/ArrayLists :)
		List<Destroyer> destroyers = new ArrayList<Destroyer>();
		destroyers.add(defaultDestroyer);
		destroyers.add(userDefinedDestroyer);		
				
		// Make a collection of Submarines (you select the type)
		List<Submarine> submarines = new ArrayList<Submarine>();
		submarines.add(annapolisSubmarine);
		submarines.add(invalidSubmarine);	
		
		// Make a collection that holds all Ships	
		List<Ship> ships = new ArrayList<Ship>();
		ships.addAll(destroyers); // add previous ship-based collections to this collection
		ships.addAll(submarines);

		// Create 2 P3s
		P3 defaultP3 = new P3("EP-3");
		P3 aircraftInFlight = new P3(450, "CP-140", 1200);	

		// Make a collection that holds all Contacts
		List<Contact> contacts = new ArrayList<Contact>();
		contacts.addAll(ships);
		contacts.add(defaultP3);
		contacts.add(aircraftInFlight);
		
		// Print out all contacts 
		System.out.println();
		System.out.println("***Print all Contacts Started***");
		for (Contact c : contacts) {
			System.out.println(c.toString());
		}
		System.out.println("***Print all Contacts Completed***");
	}

}
