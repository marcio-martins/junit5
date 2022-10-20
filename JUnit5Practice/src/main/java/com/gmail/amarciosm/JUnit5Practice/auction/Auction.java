package com.gmail.amarciosm.JUnit5Practice.auction;

import java.util.ArrayList;
import java.util.List;

public class Auction {

	private List<Snack> snackList;
	
	public Auction() {
		super();
		snackList = new ArrayList<Snack>();
	}
	
	public void propose(Snack newSnack) {
		snackList.add(newSnack);
	}

	public List<Snack> getSnackList() {
		return snackList;
	}

	public void setSnackList(List<Snack> snackList) {
		this.snackList = snackList;
	}
	
	
	
}
