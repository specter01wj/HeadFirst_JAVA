package com.ch04.exec;

public class ClockTestDrive {

	public static void main(String[] args) {
		Clock c = new Clock();
		
		c.setTime("12:34PM");
		String tod = c.getTime();
		
		System.out.println("time: " + tod);
	}

}

class Clock {
	String time;

	String getTime() {
		return time;
	}

	void setTime(String time) {
		this.time = time;
	}
	
	
}
