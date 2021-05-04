package com.wedapp;

import java.time.LocalDate;
import java.time.LocalTime;

public class BookingManager {

	/**
	 * This method checks the date and time by the user
	 * @param wedDate
	 * @param wedTime
	 * @return true if the booking date and time is after the current date and time
	 */
	public static boolean dateTimeValidator(String wedDate, String wedTime) {
		boolean valid = false;
		;
		System.out.println("Please wait .....until Checking your date and time...");
		System.out.println();
		LocalDate wedDate_obj = LocalDate.parse(wedDate); // date to obj //
		LocalTime wedTime_obj = LocalTime.parse(wedTime); // time to obj //

		LocalDate currentdate = LocalDate.now(); // current date //
		LocalTime currenttime = LocalTime.now();// current time //

		if ((wedDate_obj.isBefore(currentdate)) || (wedTime_obj.isBefore(currenttime))
				|| (wedDate_obj.isEqual(currentdate))) {
			System.out.println("Entered date/time is incorect");
			System.out.println("Sorry!Unbale to book");
			valid = false;
		}

		else if (wedDate_obj.isAfter(currentdate) && wedTime_obj.isAfter(currenttime)) {
			System.out.println("You are eligible for booking,Go ahead..");
			valid = true;
		}

		return valid;

	}
}
