package com.wedapp;

import java.util.HashMap;
import java.util.Set;

public class WeddingStyleDisplay {
	static HashMap<String, Integer> wedTypes = new HashMap<String, Integer>();
	static HashMap<String, Integer> locTypes = new HashMap<String, Integer>();

	/**
	 * This method will display all the wedding styles available with their package
	 */
	public static void wedTypeChooser() {

		System.out.println("Wedding Types:");

		wedTypes.put("Traditional Wedding", 100000);
		wedTypes.put("Formal Wedding", 80000);
		wedTypes.put("Informal Wedding", 90000);
		wedTypes.put("Festival Wedding", 300000);
		wedTypes.put("Vintage style Wedding", 500000);

		// to get key---> HashSet
		// to get value--->.get(key)
		Set<String> keySet = wedTypes.keySet();
		for (String key : keySet) {
			Integer value = wedTypes.get(key);
			System.out.println(key + "- You may charge upto " + value + "Rs.");
		}

	}

	/**
	 * This method will display all the wedding location types available with their
	 * package
	 */
	public static void locationChooser() {

		System.out.println();
		System.out.println("Location Types:");

		locTypes.put("Stand alone Bouquet hall", 50000);
		locTypes.put("Hotel/Resort", 40000);
		locTypes.put("Bars", 30000);
		locTypes.put("Museum", 20000);
		locTypes.put("Historic site", 60000);

		Set<String> keySet = locTypes.keySet();
		for (String key : keySet) {
			Integer value = locTypes.get(key);
			System.out.println(key + "- You may charge upto " + value + "Rs.");
		}

	}

}
