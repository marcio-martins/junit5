package com.gmail.amarciosm.JUnit5Practice.auction;

public class Evaluator {

	private Snack biggestSnack;

	public void evaluate(Auction auction) {
		for (Snack s : auction.getSnackList()) {
			if (biggestSnack == null) {
				biggestSnack = s;
			} else {
				if (biggestSnack.getSnackValue() < s.getSnackValue()) {
					biggestSnack = s;
				}
			}
		}
	}
	
	public Snack getBiggestSnack() {
		return biggestSnack;
	}
	
	public static void main(String args[]) {
		Auction auction = new Auction();
		auction.propose(new Snack("Jonh", 300d));
		auction.propose(new Snack("Mary", 200d));
		auction.propose(new Snack("Kelly", 500d));
		
		Evaluator evaluator = new Evaluator();
		evaluator.evaluate(auction);
		Snack winner = evaluator.getBiggestSnack();
		
		System.out.println(winner.getSnackValue());
	}

}
