package com.gmail.amarciosm.JUnit5Practice;

import java.util.List;

public class DoesEverything {

	public static void main(String[] args) {
		System.out.println("Hello JUnit 5");
	}
	
	public Integer sum(List<Integer> integers) {
		Integer total = 0;
		
		for(Integer i : integers) {
			total += i;
		}
		
		return total;
	}
	
}
