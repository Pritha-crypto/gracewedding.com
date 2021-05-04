package com.WedApp;

import org.junit.Test;

import com.wedapp.AdditionalDetailsDisplayManager;

public class AdditionalDetailsDisplayTestCase {
	
	/**
	 * This method will display all the morning, noon, evening food details availability
	 */
	@Test
	public void test1() {
		AdditionalDetailsDisplayManager.foodTypes();
	}
	
	/**
	 * This method will display all the guest counts availability
	 */
	@Test
	public void test2() {
		AdditionalDetailsDisplayManager.guestCount();
	}
	
	/**
	 * This method will display all the decoration details availability
	 */
	@Test
	public void test3() {
		AdditionalDetailsDisplayManager.decorDetails();
	}
	
	
}
