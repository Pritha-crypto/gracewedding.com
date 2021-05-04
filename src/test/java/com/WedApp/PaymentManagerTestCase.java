package com.WedApp;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wedapp.PaymentValidator;

public class PaymentManagerTestCase {

	// Test Cases for expiry date in payment card
	/**
	 * This method checks with future expirydate It should return true as it a valid
	 * input
	 */
	@Test
	public void expiryDateTest1() {
		boolean isValid = PaymentValidator.isExpired("2021-09-07");
		assertTrue(isValid);
	}

	/**
	 * This method checks with past expirydate It should return false as it a
	 * invalid input
	 */
	@Test
	public void expiryDateTest2() {
		boolean isValid = PaymentValidator.isExpired("2020-09-07");
		assertFalse(isValid);
	}

	// Test cases for valid amount
	/**
	 * This method checks with particular range of payment(min>0 and max<=10,00000)
	 * It should return true as its a valid amount
	 */
	@Test
	public void validAmountTest3() {
		boolean isValid = PaymentValidator.isInRangeAmount(1000000);
		assertTrue(isValid);
	}

	/**
	 * This method checks with particular range of payment(min>0 and max<=10,00000)
	 * It should return False as its a invalid amount
	 */
	@Test
	public void validAmountTest4() {
		boolean isValid = PaymentValidator.isInRangeAmount(0);
		assertFalse(isValid);
	}

	/**
	 * This method checks with particular range of payment(min>0 and max<=10,00000)
	 * It should return true as it a valid amount
	 */
	@Test
	public void validAmountTest5() {
		boolean isValid = PaymentValidator.isInRangeAmount(10000);
		assertTrue(isValid);
	}

	// Test cases for valid cardNumber
	/**
	 * This method checks the valid cardNumber(13 to 16 digits)
	 * It must starts with either 4,5,37 or 6
	 * It should return true as its a valid cardNo
	 */
	@Test
	public void cardValidTest6() {
		boolean isValid = PaymentValidator.isValidCardNumber(62356779900876L);
		assertTrue(isValid);
	}
	/**
	 * This method checks the valid cardNumber(13 to 16 digits)
	 * It must starts with either 4,5,37 or 6
	 * It should return true as its a valid cardNo
	 */

	@Test
	public void cardValidTest7() {
		boolean isValid = PaymentValidator.isValidCardNumber(5456476758695555L);
		assertTrue(isValid);
	}
	/**
	 * This method checks the valid cardNumber(13 to 16 digits)
	 * It must starts with either4,5,37 or 6
	 * It should return true as its a valid cardNo
	 */
	@Test
	public void cardValidTest8() {
		boolean isValid = PaymentValidator.isValidCardNumber(432859594900312L);
		assertTrue(isValid);
	}
	/**
	 * This method checks the valid cardNumber(13 to 16 digits)
	 * It must starts with either4,5,37 or 6
	 * It should return true as its a valid cardNo
	 */
	@Test
	public void cardValidTest9() {
		boolean isValid = PaymentValidator.isValidCardNumber(373837477382829L);
		assertTrue(isValid);
	}
	/**
	 * This method checks the valid cardNumber(13 to 16 digits)
	 * It must starts with either4,5,37 or 6
	 * It should return False as its a invalid cardNo
	 */
	@Test
	public void cardValidTest10() {
		boolean isValid = PaymentValidator.isValidCardNumber(1223495958857485L);
		assertFalse(isValid);
	}
	/**
	 * This method checks the valid cardNumber(13 to 16 digits)
	 * It must starts with either4,5,37 or 6
	 * It should return false as its a invalid cardNo
	 */
	@Test
	public void cardValidTest11() {
		boolean isValid = PaymentValidator.isValidCardNumber(99887L);
		assertFalse(isValid);
	}

	// Test cases for valid Payment Type
	/**
	 * This method checks the valid payment type
	 * Valid Payment cards are - VISA,RUPAY,DISCOVER,AMERICAN EXPRESS cards
	 * It should return true as it is a valid type
	 */
	@Test
	public void paymentValidTest12() {
		PaymentValidator.PaymentTypes();
		boolean isValid = PaymentValidator.isValidPaymentType("VISA CARD");
		assertTrue(isValid);
	}
	/**
	 * This method checks the valid payment type
	 * Valid Payment cards are - VISA,RUPAY,DISCOVER,AMERICAN EXPRESS cards
	 * It should return true as it is a valid type
	 */
	@Test
	public void paymentValidTest13() {
		PaymentValidator.PaymentTypes();
		boolean isValid = PaymentValidator.isValidPaymentType("rupay card");
		assertTrue(isValid);
	}
	/**
	 * This method checks the valid payment type
	 * Valid Payment cards are - VISA,RUPAY,DISCOVER,AMERICAN EXPRESS cards
	 * It should return false as it is a invalid type
	 */
	@Test
	public void paymentValidTest14() {
		PaymentValidator.PaymentTypes();
		boolean isValid = PaymentValidator.isValidPaymentType(" $#");
		assertFalse(isValid);
	}

	// TestCases for cvv number validation
	/**
	 * This method checks for the cvv validation(3 to 4 digits)
	 * It should return true as it is valid input
	 */
	@Test
	public void cvvValidTest15() {
		boolean isValid = PaymentValidator.cvvNoValidation(345);
		assertTrue(isValid);
	}
	/**
	 * This method checks for the cvv validation(3 to 4 digits)
	 * It should return true as it is valid input
	 */
	@Test
	public void cvvValidTest16() {
		boolean isValid = PaymentValidator.cvvNoValidation(3456);
		assertTrue(isValid);
	}
	/**
	 * This method checks for the cvv validation(3 to 4 digits)
	 * It should return false as it is invalid input
	 */
	@Test
	public void cvvValidTest17() {
		boolean isValid = PaymentValidator.cvvNoValidation(-123);
		assertFalse(isValid);
	}
	// TestCases for purposevalidation
	/**
	 * This method checks for the valid string of purpose of transaction of amount
	 * It should true if it a valid string
	 */
	@Test
	public void purposeValidTest18() {
		boolean isValid = PaymentValidator.purposeValidation("Half amount is settled");
		assertTrue(isValid);
	}
	/**
	 * This method checks for the valid string of purpose of transaction of amount
	 * It should true if it a valid string
	 */
	@Test
	public void purposeValidTest19() {
		boolean isValid = PaymentValidator.purposeValidation("@#$");
		assertFalse(isValid);
	}

	// Test cases for generate otp

	/**
	 * This method checks for the otp generatiom with correct data
	 */
	@Test
	public void otpGenerationTest20() {
		String otp = PaymentValidator.generateOTP("2021-05-12", 432859594900312L, 1000, "VISA CARD", 345,
				"Full amount is settled");
		System.out.println(otp);
	}

	/**
	 * This method checks for the otp generation with incorrect data
	 */
	public void otpGenerationTest21() {
		String otp = PaymentValidator.generateOTP("2020-05-12", 432859594900312L, 1000, "VISA CARD", 345,
				"Full amount is settled");
		System.out.println(otp);
	}

}
