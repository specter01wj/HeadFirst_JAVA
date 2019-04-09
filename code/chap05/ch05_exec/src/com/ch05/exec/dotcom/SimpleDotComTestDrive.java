package com.ch05.exec.dotcom;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2, 3, 4};
		dot.setLocationCells(locations);
		//String userGuess = "3";
		//String result = dot.checkYourself(userGuess);
		String result = "";
		for(int i = 1; i <= 4; i++) {
			result = dot.checkYourself(Integer.toString(i));
			System.out.println("You hit " + i + " -> " + result);
		}
		//System.out.println("You hit " + userGuess + " -> " + result);
	}

}
