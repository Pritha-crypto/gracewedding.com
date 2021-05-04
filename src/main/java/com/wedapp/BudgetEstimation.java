package com.wedapp;

import java.util.Set;
import java.util.TreeSet;

public class BudgetEstimation {
	static int total = 0;
	TreeSet<String> choosedAdditionalFeaturesList = new TreeSet<String>();

	/**
	 * This method is used to validate the input choosed by the customer
	 * 
	 * @param choosedWeddingType
	 * @param choosedLocationType
	 * @return
	 */
	public static boolean isValidString(String choosedWeddingType, String choosedLocationType) {
		boolean isValid = true;
		if (choosedLocationType == null || choosedLocationType.trim().equals("") || choosedWeddingType == null
				|| choosedWeddingType.trim().equals("")) {
			isValid = false;
		}
		return isValid;
	}

	/**
	 * This method used to estimate the fare according to the choosed wedding type
	 * and location type
	 * 
	 * @param choosedWeddingType
	 * @param choosedLocationType
	 * @return fare
	 */
	public static int fareEstimation(String choosedWeddingType, String choosedLocationType) {
		int fare = 0;
		if (isValidString(choosedWeddingType, choosedLocationType)) {
			Set<String> keySet1 = WeddingStyleDisplay.wedTypes.keySet();
			Set<String> keySet2 = WeddingStyleDisplay.locTypes.keySet();
			for (String key1 : keySet1) {
				for (String key2 : keySet2) {
					if (choosedWeddingType.equals(key1) && choosedLocationType.equals(key2)) {
						Integer value1 = WeddingStyleDisplay.wedTypes.get(key1);
						Integer value2 = WeddingStyleDisplay.locTypes.get(key2);
						fare = value1 + value2;
					}
				}
			}
		}
		return fare;
	}

	/**
	 * This method is used to calculate the amount selected by customer from the
	 * additonal features list.
	 * 
	 * @return total fare
	 */
	public int calculateAmount(int fare) {
		for (String featureName : choosedAdditionalFeaturesList) {
			if (AdditionalDetailsDisplayManager.additionalFeaturesList.containsKey(featureName)) {
				Integer featureAmount = AdditionalDetailsDisplayManager.additionalFeaturesList.get(featureName);
				System.out.println(featureName + " " + featureAmount);// map.get(featureName);
				total += featureAmount;

			}
		}

		System.out.println("Total:" + total);

		return total + fare;
	}

	/**
	 * This method used to add the the choosed additoanl features list from the
	 * default declared list.
	 * 
	 * @param choosedAdditionalFeature
	 * @return choosedAdditionalFeature
	 */
	public String addFeature(String choosedAdditionalFeature) {
		if (!(choosedAdditionalFeature == null || choosedAdditionalFeature.trim().equals(""))) {
			choosedAdditionalFeaturesList.add(choosedAdditionalFeature);

		} else {
			throw new IllegalArgumentException("Invalid Additional Feature choosed");
		}

		return choosedAdditionalFeature;
	}

	/**
	 * This method used to calculate the no.of.features they selected
	 * 
	 * @return no.of.features
	 */
	public int getNoOfFeatures() {
		return choosedAdditionalFeaturesList.size();
	}

}