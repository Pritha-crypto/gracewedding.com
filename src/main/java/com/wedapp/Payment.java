package com.wedapp;

import java.time.LocalDate;

public class Payment {

	// payment domain class

	public String userName;
	public String paymentType;
	public long cardNo;
	public Integer cvv;
	public Integer amount;
	public String purpose;
	public LocalDate expiryDate;
	@Override
	public String toString() {
		return "Payment [userName=" + userName + ", paymentType=" + paymentType + ", cardNo=" + cardNo + ", cvv=" + cvv
				+ ", amount=" + amount + ", purpose=" + purpose + ", expiryDate=" + expiryDate + "]";
	}
	
}
