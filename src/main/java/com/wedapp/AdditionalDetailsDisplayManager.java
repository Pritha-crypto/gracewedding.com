package com.wedapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class AdditionalDetailsDisplayManager {

	static HashMap<String, Integer> additionalFeaturesList = new HashMap<String, Integer>();

	/**
	 * This method will display all the foodtypes available Separate list are
	 * declared for morning, noon and evening foodtypes
	 */
	public static void foodTypes() {

		// morning food display
		TreeSet<String> morningFood = new TreeSet<String>();
		morningFood.add("Idly");
		morningFood.add("Poori");
		morningFood.add("Vadai");
		morningFood.add("Dosa");
		morningFood.add("Chappathi");

		for (String key : morningFood) {
			System.out.println(key);
		}

		System.out.println();
		// noon food display
		TreeSet<String> noonFood = new TreeSet<String>();
		noonFood.add("Fish");
		noonFood.add("Briyani");
		noonFood.add("Meals");
		noonFood.add("SeaFoods");
		noonFood.add("DryFoods");

		for (String key : noonFood) {
			System.out.println(key);
		}

		System.out.println();
		// evening food display
		TreeSet<String> eveningFood = new TreeSet<String>();
		eveningFood.add("Hot drinks");
		eveningFood.add("Somosa");
		eveningFood.add("Fruits");
		eveningFood.add("Salads");
		eveningFood.add("Cutlet");

		for (String key : eveningFood) {
			System.out.println(key);
		}
	}

	/**
	 * This method will display guescount details availability Customer can select
	 * one guestcount among these
	 */
	public static void guestCount() {

		System.out.println();
		// guestcount display
		ArrayList<String> guestNo = new ArrayList<String>();
		guestNo.add("10");
		guestNo.add("50");
		guestNo.add("100");
		guestNo.add("500");
		guestNo.add("1000");

		for (String type : guestNo) {
			System.out.println(type);
		}
	}

	/**
	 * This method will display all the decoration details availability Customer can
	 * select decorations they want from these decorInfo list
	 */

	public static void decorDetails() {

		// display decoration details
		TreeSet<String> decorInfo = new TreeSet<String>();
		decorInfo.add("Tables and chairs");
		decorInfo.add("Flower Basket");
		decorInfo.add("Send off bubbles");
		decorInfo.add("Gift box");
		decorInfo.add("Hang String lights");

		for (String key : decorInfo) {
			System.out.println(key);
		}
	}

	/**
	 * This method will display all the addiitonal features details availability
	 * Customer can select one or more features they want from these additional
	 * features list
	 */
	public static void additionalFeatures() {

		additionalFeaturesList.put("FireWorks", 10000);
		additionalFeaturesList.put("Travel and Transport", 15000);
		additionalFeaturesList.put("Photography", 30000);
		additionalFeaturesList.put("Music and Entertainment", 25000);
		additionalFeaturesList.put("Royal Procession", 40000);

		Set<String> keySet = additionalFeaturesList.keySet();
		for (String key : keySet) {
			Integer value = additionalFeaturesList.get(key);
			System.out.println(key + "- You may charge upto " + value + "Rs.");
		}
	}
}
