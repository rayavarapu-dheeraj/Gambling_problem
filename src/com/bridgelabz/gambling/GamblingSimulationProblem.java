package com.bridgelabz.gambling;

public class GamblingSimulationProblem {
	final static int STAKE = 100, BET = 1;
	
	public static void winOrLoose() {
		final int random = (int) (Math.random() * 2);
		if (random == 0) 
			System.out.println("the gambler won ");
		else 
			System.out.println("the gambler lost ");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation Problem");
		winOrLoose();
	}
}