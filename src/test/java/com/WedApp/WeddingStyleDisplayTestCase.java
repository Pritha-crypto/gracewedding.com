package com.WedApp;


import org.junit.Test;

import com.wedapp.WeddingStyleDisplay;

public class WeddingStyleDisplayTestCase {

	/**
	 * It will show all the lists of Wedding Types stored in hashMap
	 */
	@Test
	public void weddingStylesListDisplay() {
		WeddingStyleDisplay.wedTypeChooser();
	}
	
	/**
	 * It will show all the lists of Location Types stored in hashMap
	 */
	@Test
	public void weddingStyleLocationsListDisplay() {
		WeddingStyleDisplay.locationChooser();
	}
	
	
	

}
