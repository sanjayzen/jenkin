package com.devops.sample;

public class SampleSonar1 {
	
	public void print() {
		String[] msg = {"One","Two","Three"};
		/*
		 * Sonar should complaint about this for look
		 */
		for (String str : msg) {
			
		}
	}

}
