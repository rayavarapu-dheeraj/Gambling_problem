package com.bridgelabz.gambling;

public class GamblingSimulationProblem {
	final static int INITIAL = 100, BET = 1;
	
	public static void bet() {
		if(Math.random() > 0.5) {
			int win = INITIAL+1;
			System.out.println("the gambler won, and the total is:"+win);
		}
		else {
			int loose = INITIAL-1;
			System.out.println("the gambler lost, and the total is:"+loose);
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation Problem");
		bet();
	}
}