package com.gmail.amarciosm.JUnit5Practice.auction;

public class Snack {
	
	private String person;
	
	private double snackValue;

	public Snack() {
		super();
	}
	
	public Snack(String person, double snackValue) {
		super();
		this.person = person;
		this.snackValue = snackValue;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public double getSnackValue() {
		return snackValue;
	}

	public void setSnackValue(double snackValue) {
		this.snackValue = snackValue;
	}

}
