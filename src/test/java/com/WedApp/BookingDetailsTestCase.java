package com.WedApp;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wedapp.BookingManager;

public class BookingDetailsTestCase {

	/*
	 * This method test with futuredate and futuretime for booking It should return
	 * true
	 */
	@Test
	public void dateTimevalidateTestCase1() {
		boolean valid = BookingManager.dateTimeValidator("2021-06-30", "18:03");
		// assertExpected(actual)
		assertTrue(valid);
	}

	/*
	 * This method test with pastdate and pasttime for booking It should return
	 * false
	 */
	@Test
	public void dateTimevalidateTestCase2() {
		boolean valid = BookingManager.dateTimeValidator("2021-04-25", "12:59:03");
		// assertExpected(actual)
		assertFalse(valid);
	}

	/*
	 * This method test with currentdate and currenttime for booking It should
	 * return false
	 */
	@Test
	public void dateTimevalidateTestCase3() {
		boolean valid = BookingManager.dateTimeValidator("2021-05-04", "17:35:03");
		// assertExpected(actual)
		assertFalse(valid);
	}

	/*
	 * This method test with futuredate and pasttime for booking It should return
	 * false
	 */
	@Test
	public void dateTimevalidateTestCase4() {
		boolean valid = BookingManager.dateTimeValidator("2021-06-29", "14:12:03");
		// assertExpected(actual)
		assertFalse(valid);
	}

	/*
	 * This method test with futuredate and currenttime for booking It should return
	 * false
	 */
	@Test
	public void dateTimevalidateTestCase5() {
		boolean valid = BookingManager.dateTimeValidator("2021-06-30", "17:31:03");
		// assertExpected(actual)
		assertFalse(valid);
	}

	/*
	 * This method test with pastdate and futuretime for booking It should return
	 * false
	 */
	@Test
	public void dateTimevalidateTestCase6() {
		boolean valid = BookingManager.dateTimeValidator("2021-04-24", "18:59:03");
		// assertExpected(actual)
		assertFalse(valid);
	}

	/*
	 * This method test with pastdate and currenttime for booking It should return
	 * false
	 */
	@Test
	public void dateTimevalidateTestCase7() {
		boolean valid = BookingManager.dateTimeValidator("2021-04-24", "17:35:03");
		// assertExpected(actual)
		assertFalse(valid);
	}

}
