package com.WedApp;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.wedapp.BudgetEstimation;
import com.wedapp.AdditionalDetailsDisplayManager;
import com.wedapp.WeddingStyleDisplay;
import static org.junit.Assert.*;

public class FareCalculationTestcase {

	// Test Cases for choosing primary wedding style and wedding location
	/**
	 * This method is validating string with invalid string input
	 */
	// @Test
	public void testingWithInvalidInput() {
		WeddingStyleDisplay.wedTypeChooser();
		WeddingStyleDisplay.locationChooser();
		boolean valid = BudgetEstimation.isValidString("    ", "  ");
		assertFalse(valid);
	}

	/**
	 * This method is validating string with valid input string
	 */
	@Test
	public void testingWithValidInput() {
		WeddingStyleDisplay.wedTypeChooser();
		WeddingStyleDisplay.locationChooser();
		boolean valid = BudgetEstimation.isValidString("Traditional Wedding", "Bars");
		assertTrue(valid);
	}

	/**
	 * This method is validating string with valid input string Also, calculates the
	 * fare for the valid input
	 */
	@Test
	public void fareTestingWithValidInput() {
		WeddingStyleDisplay.wedTypeChooser();
		WeddingStyleDisplay.locationChooser();
		if (BudgetEstimation.isValidString("Formal Wedding", "Museum") == true) {
			int actualFare = BudgetEstimation.fareEstimation("Formal Wedding", "Museum");
			// assertEquals(Expected, Equals) //
			assertEquals(100000, actualFare);
		}
	}

	/**
	 * This method is validating string with invalid input string It says Invalid
	 * Input as it is a invalid string This will return nothing as its a invalid
	 * input
	 */
	@Test
	public void fareTestingWithInValidInput() {
		WeddingStyleDisplay.wedTypeChooser();
		WeddingStyleDisplay.locationChooser();
		if (BudgetEstimation.isValidString("   ", "  ") == false) {
			int actualFare = BudgetEstimation.fareEstimation("  ", "  ");
			assertEquals(0, actualFare);
		}
	}

	// TestCases for choosing additional features

	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	/**
	 * This method used to calculate additoanl feature amount with two invalid input
	 * It should throw exception
	 */
	@Test
	public void additionalFareTestingWithInValidInput() {
		BudgetEstimation obj = new BudgetEstimation();
		AdditionalDetailsDisplayManager.additionalFeatures();
		// int amount = obj.calculateAmount();
		exceptionRule.expect(IllegalArgumentException.class);
		exceptionRule.expectMessage("Invalid Additional Feature choosed");
		obj.addFeature("  ");

	}

	/**
	 * This method used to calculate additoanl feature amount with one valid input
	 * and one invalid input It should throw exception
	 */
	@Test
	public void additionalFareTestingWithTwoInvalidInput() {
		BudgetEstimation obj = new BudgetEstimation();
		AdditionalDetailsDisplayManager.additionalFeatures();
		// int amount = obj.calculateAmount();
		exceptionRule.expect(IllegalArgumentException.class);
		exceptionRule.expectMessage("Invalid Additional Feature choosed");
		obj.addFeature("FireWorks");
		obj.addFeature("  ");
	}

	/**
	 * This method tested for returning the no.of.Features
	 */
	@Test
	public void noOfadditionalFeatureWithValidInput() {
		BudgetEstimation obj = new BudgetEstimation();
		AdditionalDetailsDisplayManager.additionalFeatures();
		obj.addFeature("FireWorks");
		obj.addFeature("Photography");
		// int amount = obj.calculateAmount();
		int noOfFeatures = obj.getNoOfFeatures();
		// assertEquals(40000,amount);
		assertEquals(2, noOfFeatures);
	}

	/**
	 * This method tested for returning the no.of.Features It should throw exception
	 * as it is a invalid input
	 */

	@Test
	public void noOfadditionalFeatureWithInValidInput() {
		BudgetEstimation obj = new BudgetEstimation();
		AdditionalDetailsDisplayManager.additionalFeatures();
		exceptionRule.expect(IllegalArgumentException.class);
		exceptionRule.expectMessage("Invalid Additional Feature choosed");
		obj.addFeature(" ");
		obj.addFeature(" ");
		// int amount = obj.calculateAmount();
		// int noOfFeatures = obj.getNoOfFeatures();
		// assertEquals(40000,amount);
		// assertEquals(2,noOfFeatures);
	}

	/**
	 * This method tests all fare related methods with valid input It should return
	 * the final fare
	 */
	@Test
	public void totalAmountWithValidInput() {
		WeddingStyleDisplay.wedTypeChooser();
		WeddingStyleDisplay.locationChooser();
		BudgetEstimation obj = new BudgetEstimation();
		int actualFare = BudgetEstimation.fareEstimation("Formal Wedding", "Museum");
		assertEquals(100000, actualFare);
		AdditionalDetailsDisplayManager.additionalFeatures();
		obj.addFeature("FireWorks");
		obj.addFeature("Photography");
		obj.addFeature("Royal Procession");
		int amount = obj.calculateAmount(actualFare);
		assertEquals(180000, amount);
		int noOfFeatures = obj.getNoOfFeatures();
		assertEquals(3, noOfFeatures);
	}

}
