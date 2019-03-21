package com.ch05.exec;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2, 3, 4};
		dot.setLocationCells(locations);
		String userGuess = "10";
		String result = dot.checkYourself(userGuess);
		System.out.println("You -> " + result);
	}

}
